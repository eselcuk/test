/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GastenBoek implements Serializable {
    private final long serialVersionUID = 1L;
    private List<GastenBoekEntry> entries = new ArrayList<GastenBoekEntry>();

    public List<GastenBoekEntry> getEntries() {
        return entries;
    }

    public void addEntry(GastenBoekEntry entry) {
        entries.add(entry);
    }
}
