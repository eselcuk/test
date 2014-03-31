/*
    Oefening 11:
    a) Maak een class Oefening11Getal die enkel een public int-property x heeft (geen constructor). Maak een tweede 
       class met een main-method. In deze method maak je een instance van de class Oefening11Getal aan. 
       Voer de waarde van x uit naar het scherm door rechtstreeks de property x aan te spreken.
    b) Maak in class Oefening11Getal de property x private. Wat stel je vast in je main-class en waarom ?
    c) Voeg aan de class Oefening11Getal de public method print() toe die de waarde van de membervariabele x op 
       het scherm toont. Wijzig de method main()zodat deze gebruik maakt van de nieuwe method om de waarde van 
       de membervariabele x op het scherm te tonen.
    d) Voeg nu een constructor aan de class Oefening11Getal toe. Deze constructor heeft een parameter (een int a). 
       De constructor kent de waarde van a toe aan de membervariabele x. Herschrijf daarop de regel uit de 
       main() die het object van Oefening11Getal aanmaakt zodat deze nu de nieuwe constructor gebruikt. 
       Merk op dat er nu geen default constructor meer wordt gemaakt.
    e) Voeg aan Oefening11Getal de method absoluut() toe. Deze method heeft als returnwaarde de absolute waarde van de 
       membervariabele x (x zelf mag niet veranderen). Tip : om de absolute waarde te berekenen kan je de functie 
       Math.abs(x) gebruiken. Wijzig de main() zodat hij gebruik maakt van deze method of anders gezegd: 
       laat de main() bijvoorbeeld de absolute waarde van -3 op het beeldscherm tonen.
    f) Voeg aan Oefening11Getal een method som(int a) toe die de som van de member-variabele x en a teruggeeft. 
       Test deze nieuwe method in de main().
    g) Voeg aan Oefening11Getal een method add(int a) toe die de membervariabele x verhoogt met a. 
       Wijzig de main() zodat die een object van de class Oefening11Getal aanmaakt, de waarde van de membervariabele x 
       op het scherm toont, deze waarde verhoogt met een int-getal d.m.v. de nieuwe method en tot slot deze 
       nieuwe waarde van de membervariabele x op het scherm toont.
    h) Nu gaan we de method som(int a) overloaden met nieuwe methods float som(float a) en double som(double a). 
       Test deze nieuwe methods in de main().
    i) Maak een method toDouble() die als returnwaarde de waarde van membervariabele x als een double teruggeeft. Test deze nieuwe method in de main().
    j) Maak een method getX() die de waarde van de membervariabele x teruggeeft en een method setX(int a) die de 
       waarde van a toekent aan de membervariabele x. Wijzig de constructor die dus gebruik zal gaan maken van 
       deze set()-method. Wijzig de main() zodat deze gebruik maakt van de get() method om de waarde op te 
       vragen en te tonen op het scherm.
 */
package jpf.classesobjectsinheritance;

public class Oefening11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oefening11Getal getal = new Oefening11Getal(-10);
        getal.print();
        System.out.println("|x|: " + getal.absoluut());
        float som = (float) getal.som(10.50);
        System.out.println("x + 10: " + som);

        //Getal getal2 = new Oefening11Getal(5);
        getal.add(6);
        getal.print();
        System.out.println("x toDouble(): " + getal.toDouble());
        System.out.println("x getX(): " + getal.getX());

    }

}
