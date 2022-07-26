// Jāuztaisa publiska klase riņķis.
// privāts mainīgais radiuss (double)
// privāts mainīgais krāsa (String)
// no-arg konstruktors, kur viemēr tiek norādīts radiuss ir 1.0, krasa ir sarkana
// konstruktors, kur mēs padodam rādiusu un krāsu
// Jāuztaisa setter un getter metodes abiem mainīgajiem.
// Pēc tam main metodē jāuzstaisa rinkis ar no ag konstukrotru. Jāaprkasta šim riņkim radiusu
// Pēc tam main metodē jāustaisa rikis ar ar konstrutoru. Jāapraksta šim rinkim krasa.
//Extra: Uztaisīt default metodi, kas aprēķina UN atgriež riņķa laukumu.

package main.java.classroomFive.uzdevumsTris;

public class Rinkis {

    private double radius;
    private String colour;

    Rinkis (){
        this.radius = 1.0; //this var šajā ga'dijumā nerakstīt
        this.colour = "red";
    }

    public Rinkis(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    double calculateArea() {
        return Math.pow(radius,2) * 3.14; //3.14 vietā vcar rakstīt Math.PI (radiuss tiek celts 2.pakāpē)
        //ja metode vai mainīgais ir static - nav jāveido klase, piemēram scanner ir jāveido, bet Math nav jāveido
    }
}
