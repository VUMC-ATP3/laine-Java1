package main.java.classroomFour;

public class House {
    int stavuSkaits;
    boolean irLifts;
    boolean irAutoStavvieta;
    String krasa;
    String ielasNosaukums;
    int majasNumurs;

    public House(int stavuSkaits, boolean irLifts, boolean irAutoStavvieta, String krasa, String ielasNosaukums, int majasNumurs) {
        this.stavuSkaits = stavuSkaits;
        this.irLifts = irLifts;
        this.irAutoStavvieta = irAutoStavvieta;
        this.krasa = krasa;
        this.ielasNosaukums = ielasNosaukums;
        this.majasNumurs = majasNumurs;
    }

    public void printHouse(){
        System.out.println("Mājas adrese ir " + adrese());
        System.out.println("Māja ir " + krasa + " krāsā");
        System.out.println("Mājā ir " + stavuSkaits +  " stāvu skaits");
    }

    public String adrese(){
        return ielasNosaukums + "" + majasNumurs;
    }
}

