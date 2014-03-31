/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

/**
 *
 * @author zi05
 */
public class Land {

    public Land(String landcode, String landnaam, String hoofdstad, long inwoners, float oppervlakte) {
        setLandCode(landcode);
        setLandNaam(landnaam);
        setHoofdstad(hoofdstad);
        setInwoners(inwoners);
        setOppervlakte(oppervlakte);
    }
    private String landCode;

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        this.landCode = landCode;
    }
    private String landNaam;

    public String getLandNaam() {
        return landNaam;
    }

    public void setLandNaam(String landNaam) {
        this.landNaam = landNaam;
    }
    private String hoofdstad;

    public String getHoofdstad() {
        return hoofdstad;
    }

    public void setHoofdstad(String hoofdstad) {
        this.hoofdstad = hoofdstad;
    }
    private long inwoners;

    public long getInwoners() {
        return inwoners;
    }

    public void setInwoners(long inwoners) {
        if (inwoners >= 0) {
            this.inwoners = inwoners;
        }
    }
    private float oppervlakte = 1.0F;

    public float getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(float oppervlakte) {
        if (oppervlakte > 0) {
            this.oppervlakte = oppervlakte;
        }
    }

    public float getBevolkingsDichtheid() {
        return getInwoners() / getOppervlakte();
    }
}
