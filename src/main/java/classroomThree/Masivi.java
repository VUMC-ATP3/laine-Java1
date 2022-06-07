package classroomThree;
import java.util.Random;
import java.util.Scanner;
public class Masivi {
    public static void main(String[] args) {

        majuParbaude(1,10,9);
        majuParbaude(2,20,13);

        String pietura = "Centrālā stacija";
        //nodefinēsim masīvu ar sarakstu
        String[] pieturas = {"Centrālā stacija", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs"};
        int skaititajs = 0;
        while (skaititajs < 4) {
            System.out.println(pieturas[skaititajs]);
            skaititajs = skaititajs + 1;
        }


        int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int e = 0;
        while (e < 9) {
            System.out.println("Majas numurs: " + majuNumuri[e]);
            e = e + 1;
        }


        char[] patskani = {'a', 'e', 'i', 'u', 'o' };

        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
        pieturas[3] = "Zemitanu STACIJA";
        System.out.println("Cik pieturas ir masīvā? " + pieturas.length);
        System.out.println("Cik majas  ir uz ielas? " + majuNumuri.length);

        String[] hokejaCempioniTopTris = new String[3];
        System.out.println("Cik vietas ir čempionātā? " + hokejaCempioniTopTris.length);
        String pirmaVieta = "Somija";
        String otraVieta = "Kanāda";
        String tresaVieta = "Čehija";

        hokejaCempioniTopTris[0] = pirmaVieta;
        hokejaCempioniTopTris[1] = otraVieta;
        hokejaCempioniTopTris[2] = tresaVieta;

        System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] + "\n" + hokejaCempioniTopTris[2]);


        System.out.println("Cikls sākas");
        //Masivu cikli (while, for, do..while, for each)
        //while (nosacījums) {Kods, kurš izpildīsies, ja nosacījums ir patiess (true)}
        int i = 0;
        //infinite loop jeb bezgalīgais cikls
        while (i < 5) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Cikls beidzās");

        //do while
        int y = 0;
        do{
            System.out.println(y);
            y = y + 1; // y++;
        }while (y<10);
        ///////////////////////////////////////////////////////


        //paroles ievade
        Scanner scanner = new Scanner(System.in);
        String parole = "Parole123";
        String lietotajaIevaditaParole;

        do {
            System.out.println("Ievadi paroli!");
            lietotajaIevaditaParole = scanner.nextLine();
            System.out.println("Notiek paroles pārbaude");
        }while(!lietotajaIevaditaParole.equals(parole));
        System.out.println("Pareiza parole");

////////////////////////////////////////////////////////////////


        //like cilvekam ievadit pozitivu skaitli, ja ievada 0 vai negativs, likt ievadit atkal.
        // Ja ir pozitivs, beigt darbu
        int number;
        do {
            System.out.println("Ievadi pozitivu skaitli");
            number = scanner.nextInt();
        }while(number<=0);
        System.out.println("Derigs skatilis " + number);

        ////////////////////////////////////////////////////////

        //for (type fori)
        for (int j = 0; j < 5; j++) {
            System.out.println("For cikls" + j);
        }

//
        for (int j = 5; j <= 10; j++) {
            System.out.println("For cikls" + j);
        }
//
        for (int j = 0; j <= 10; j=j+2) {
            System.out.println("For cikls" + j);
        }
//
        String [] mansMasivs = {"Juris", "Anna", "Peteris", "Jans"};
        for (int j = 0; j < mansMasivs.length; j++) {
            System.out.println(mansMasivs[j]);

        }
//
        for (int j = 0; j >= -100; j--) {
            System.out.println("FOR CIKLS" + j);
        }
//
        ////////////////////////////////////////////////
        //for each
        String [] mansMasivs2 = {"Juris", "Anna", "Peteris", "Jans"};
        for(String xxxx : mansMasivs2){ //katram stringam manā Masīvā izdari šo
            System.out.println(xxxx);
        }
////////////////////////////////////////////////////////
       //break salauž ciklu, piemērs zemāk:
        System.out.println("=============CIKLA SĀKUMS================");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("J ir 5, lauzam ciklu");
                break;
            }
            System.out.println("PRINT BREAK EXAMPLE" + j);
            System.out.println("=============CIKLA BEIGAS=================");

        }
        /////////////////////////////////////////////////
        int[] skaitluMasivs = {3, 4, 6, 7, 2, 1, -5, 4, 2, 6, -4, -3, 3};
        //atrast masīvā pirmo negatīvo skaitli un izvadīt to un  tā indexu(poziciju) uz ekrāna

        for (int j = 0; j < skaitluMasivs.length; j++) {
            if (skaitluMasivs[j] < 0) {
                System.out.println("Pirmais negativais skaitlis: " + skaitluMasivs[j]);
                System.out.println("Indekss ir: " + j);
                break;
            }
        }
        ////////////////////////////////////////////
        //continue (nav popuāri izmantots)
        int[] skaitluMasivs2 = {3, 4, 6, 7, 2, 1, -5, 4, 2, 6, -4, -3, 3};
        for (int j = 0; j < skaitluMasivs2.length; j++) {
            if(skaitluMasivs[j]<0){
                continue;
            }
            System.out.println("Vērtība no masīva: " + skaitluMasivs2);
        }
        ///////////////////////////////////////////
        //klase random
        Random skaitluGenerators = new Random();
        for (int o = 0; o < 1000 ; i++) {
            System.out.println(skaitluGenerators.nextInt(1000));
        }
        int nejaussSkaitlis = skaitluGenerators.nextInt(50);
        System.out.println(nejaussSkaitlis);


///////////////////////////////////////////
//
        int sakotnejs = 1;
        while (sakotnejs <= 1000) {
            System.out.println(sakotnejs);
            sakotnejs++; // nozīmē tieši to pašu --> sakotnejs = sakotnejs +1;
        }

        //tikai para skaitļus!
        int sakotnejs2 = 0;
        while (sakotnejs2 <= 100) {
            System.out.println(sakotnejs2);
            sakotnejs2 = sakotnejs2 + 2;
        }


    }

    static void printetTekstaMasivu(String[] randomMasivs) {
        int skaititajs = 0;
        while (skaititajs < randomMasivs.length) {
            System.out.println(randomMasivs[skaititajs]);
            skaititajs = skaititajs + 1;
        }
    }

    static void printetIntegerMasivu(int[] kautKo) {
        int i = 0;
        while (i < kautKo.length) {
            System.out.println(kautKo[i]);
            i++; //i = i + 1;
        }
    }

    static void majuParbaude(int sakums, int beigas, int iznemums) {
        int majuNumuri = sakums;
        while (majuNumuri <= beigas) {
            if(majuNumuri%3==0 || majuNumuri%5==0 || majuNumuri ==iznemums){
                System.out.println("šie māju numuri neder" + majuNumuri);
            } else {
                System.out.println("šie māju numuri DER" + majuNumuri);
            }
            majuNumuri = majuNumuri + 1;
        }
    }


}
