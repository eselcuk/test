package jpf.classesobjectsinheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zi05
 */
public class Oefening12Waarnemer {

    private int minimumTemperatuur = 99;
    private int maximumTemperatuur = -99;
    private float gemiddeldeTemperatuur = 0F;
    private int aantalWaarnemingen = 0;

    public void nieuweRegistratie(int temperatuur) {
        float som = gemiddeldeTemperatuur * aantalWaarnemingen + temperatuur;
        aantalWaarnemingen++;
        gemiddeldeTemperatuur = som / aantalWaarnemingen;
        if (temperatuur < minimumTemperatuur) {
            minimumTemperatuur = temperatuur;
        } else if (temperatuur > maximumTemperatuur) {
            maximumTemperatuur = temperatuur;
        }
    }

    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }

    public int getMinimumTemperatuur() {
        return minimumTemperatuur;
    }

    public int getMaximumTemperatuur() {
        return maximumTemperatuur;
    }

    public float getGemiddeldeTemperatuur() {
        return gemiddeldeTemperatuur;
    }
}
