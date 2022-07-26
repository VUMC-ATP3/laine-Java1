package main.java.classroomFour;

public class Main {
    public static void main(String[] args) {
        House majaViens = new House(5,false,true,"zilā", "Lapu iela", 69);
        majaViens.printHouse();
        House majaDivi = new House(10,true,true, "baltā","Bērzu iela", 55);
        majaDivi.printHouse();

        Velosipeds velozzk = new Velosipeds();
        velozzk.bremzuTips = 'D';
        velozzk.printetAtrumu();
        System.out.println("Cilveks uzkapj uz velo un min pedalus");
        velozzk.spiestPedalus();
        velozzk.spiestPedalus();
        velozzk.spiestPedalus();
        velozzk.spiestPedalus();
        velozzk.spiestPedalus();
        System.out.println("Velo atrums ir " + velozzk.atrums);
        System.out.println("Priekšā izlec kaķis! Vajag bremzēt!");
        velozzk.bremzet();
        velozzk.bremzet();
        System.out.println("Velo atrums ir " + velozzk.atrums);
        Velosipeds merinda = new Velosipeds();
        merinda.bremzuTips = 'V';
        merinda.printetAtrumu();

        Zivs lidaka = new Zivs();
        lidaka.irLotiAsakaina = true;
        Zivs silke = new Zivs();
        silke.irLotiAsakaina = false;

        Rinkis mansRinkis = new Rinkis(5);
        System.out.println(mansRinkis.PI);
        System.out.println(mansRinkis.radiuss);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkis2 = new Rinkis();
        System.out.println(mansRinkis2.PI);
        mansRinkis2.radiuss = 52;
        System.out.println(mansRinkis2.radiuss);
        System.out.println(mansRinkis2.aprekinatLaukumu());
        System.out.println(mansRinkis2.aprekinatRinkaLinijasGarumu());
        mansRinkis.printCreatedTime();
        mansRinkis2.printCreatedTime();

        Rinkis mansRinkis3 = new Rinkis(12.3);

        Taisnsturis taisnsturisViens = new Taisnsturis(5,6);
        taisnsturisViens.malaViens = 12.4;
        taisnsturisViens.malaDivi = 34.32;
        System.out.println("Taisnstura laukums " + taisnsturisViens.aprekinatLaukumu());


        Suns reksis = new Suns();
        reksis.vaiRej = false;
        System.out.println(reksis.vaiRej);
        reksis.astesGarums = 10;
        reksis.printName();
        reksis.izdodSkanu();

        Animal dzivnieks = new Animal();
        dzivnieks.izdodSkanu();

    }
}
