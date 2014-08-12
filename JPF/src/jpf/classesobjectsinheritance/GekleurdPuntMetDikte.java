
package jpf.classesobjectsinheritance;

/**
 *
 * @author zi05
 */
public class GekleurdPuntMetDikte extends GekleurdPunt {

    private int dikte=0;

    @Override
    public String schrijf() {
        return super.schrijf() + " dikte: " + dikte;
    }

    @Override
    public void extra() {
        System.out.println("This is extra berich van uit GekleurdPuntMetDikte");
    }

    public int getDikte() {
        return dikte;
    }

    public void setDikte(int dikte) {
        this.dikte = dikte;
    }

}
