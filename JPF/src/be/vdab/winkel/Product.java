package be.vdab.winkel;

import java.math.BigDecimal;

public class Product {

    private String omschrijving;
    private BigDecimal prijs;

    public Product() {
    }

    public Product(String oms, BigDecimal pr) {
        setOmschrijving(oms);
        setPrijs(pr);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Product)) {
            return false;
        }
        Product andere = (Product) object;
        return this.omschrijving.equals(andere.omschrijving);
    }

    public int hashCode() {
        return omschrijving.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%29s %.2f ", omschrijving, prijs);
    }
}
