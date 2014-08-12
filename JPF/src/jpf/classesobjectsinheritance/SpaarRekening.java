package jpf.classesobjectsinheritance;

/* * SpaarRekening.java */
/**
 * * * @author slucas
 */
public class SpaarRekening extends Rekening {

    private static double intrest;

    public SpaarRekening(String reknr, double intrest) throws RekeningException{
        super(reknr);
        this.intrest = intrest;
    }

    @Override
    public double geefSaldo() {
        double rente = berekenRente();
        saldo += rente;
        return saldo;
    }

    private double berekenRente() {
        //double saldo = super.geefSaldo();
        return saldo * intrest / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + intrest;
    }

    public void toon() {
        System.out.println("Dit is een spaarrekening waarop "
                + intrest + "% intrest gegeven wordt.");
    }
}
