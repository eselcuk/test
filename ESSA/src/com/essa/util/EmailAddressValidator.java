/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essa.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.xml.bind.Validator;

@FacesValidator("emailValidator")
public class EmailAddressValidator implements Validator {

    private String localPart;
    private String hostName;
    private boolean domain = true;

    Locale locale;
    ResourceBundle bundle;

    private List<FacesMessage> messages = new ArrayList<FacesMessage>();

    private HostnameValidator hostnameValidator;

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        setOptions(component);
        String email    = (String) value;
        boolean result  = true;
        Pattern pattern = Pattern.compile("^(.+)@([^@]+[^.])$");
        Matcher matcher = pattern.matcher(email);

        locale = context.getViewRoot().getLocale();
        bundle = ResourceBundle.getBundle("com.myapp.resources.validationMessages", locale);

        boolean length = true;
        boolean local  = true;

        if (matcher.find()) {
            localPart   = matcher.group(1);
            hostName    = matcher.group(2);

            if (localPart.length() > 64 || hostName.length() > 255) {
                length          = false;
                addMessage("enterValidEmail", "email.AddressLengthExceeded");
            } 

            if (domain == true) {
                hostnameValidator = new HostnameValidator();
                hostnameValidator.validate(context, component, hostName);
            }

            local = validateLocalPart();

            if (local && length) {
                result = true;
            } else {
                result = false;
            }

        } else {
            result          = false;
            addMessage("enterValidEmail", "invalidEmailAddress");
        }

        if (result == false) {
            throw new ValidatorException(messages);
        }

    }

    private boolean validateLocalPart() {
        // First try to match the local part on the common dot-atom format
        boolean result = false;

        // Dot-atom characters are: 1*atext *("." 1*atext)
        // atext: ALPHA / DIGIT / and "!", "#", "$", "%", "&", "'", "*",
        //        "+", "-", "/", "=", "?", "^", "_", "`", "{", "|", "}", "~"
        String atext = "a-zA-Z0-9\\u0021\\u0023\\u0024\\u0025\\u0026\\u0027\\u002a"
                + "\\u002b\\u002d\\u002f\\u003d\\u003f\\u005e\\u005f\\u0060\\u007b"
                + "\\u007c\\u007d\\u007e";
        Pattern regex = Pattern.compile("^["+atext+"]+(\\u002e+["+atext+"]+)*$");
        Matcher matcher = regex.matcher(localPart);
        if (matcher.find()) {
            result = true;
        } else {
            // Try quoted string format

            // Quoted-string characters are: DQUOTE *([FWS] qtext/quoted-pair) [FWS] DQUOTE
            // qtext: Non white space controls, and the rest of the US-ASCII characters not
            //   including "\" or the quote character
            String noWsCtl = "\\u0001-\\u0008\\u000b\\u000c\\u000e-\\u001f\\u007f";
            String qText = noWsCtl + "\\u0021\\u0023-\\u005b\\u005d-\\u007e";
            String ws = "\\u0020\\u0009";

            regex = Pattern.compile("^\\u0022(["+ws+qText+"])*["+ws+"]?\\u0022$");
            matcher = regex.matcher(localPart);
            if (matcher.find()) {
                result = true;
            } else {
                addMessage("enterValidEmail", "email.AddressDotAtom");
                addMessage("enterValidEmail", "email.AddressQuotedString");
                addMessage("enterValidEmail", "email.AddressInvalidLocalPart");
            }
        }

        return result;
    }

    private void addMessage(String detail, String summary) {
        String detailMsg = bundle.getString(detail);
        String summaryMsg = bundle.getString(summary);
        messages.add(new FacesMessage(FacesMessage.SEVERITY_ERROR, summaryMsg, detailMsg));
    }

    private void setOptions(UIComponent component) {
        Boolean domainOption = Boolean.valueOf((String) component.getAttributes().get("domain"));
        //domain = (domainOption == null) ? true : domainOption.booleanValue();
    }
}