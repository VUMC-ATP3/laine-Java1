package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        pirmaisUzdevums();
        otraisUzdevums();
        tresaisUzdevums();
        ceturtaisUzdevums();
        piektaisUzdevums();
        sestaisuzdevums();
    }

    private static void sestaisuzdevums() {
        System.out.println("\n" + "6.uzdevums");
        Scanner scanner = new Scanner(System.in);
        int pin = 2255;
        int ievaditaisPin;
        for (int meginajums = 1; meginajums <= 3; meginajums++) {
            System.out.println("Ievadi PIN!");
            ievaditaisPin = scanner.nextInt();
            if (ievaditaisPin == pin) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                break;
            } else if (meginajums == 3) {
                    System.out.println("Atvainojiet, bet jūs esat bloķēts!");
                } else System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
            }
        }
    /////////////////////////////////////////////////////////////////
    private static void piektaisUzdevums() {
        System.out.println("\n" + "5.uzdevums");
        {
            int skaitlis = 4, s = 1;
            long faktorials = 1;
            while(s <= skaitlis)
            {
                faktorials *= s; s++;
            }
            System.out.printf("Faktoriāls skaitlim %d = %d", skaitlis, faktorials);
        }
    }
    /////////////////////////////////////////////////////////////////
    private static void ceturtaisUzdevums() {
        System.out.println("\n" + "4.uzdevums");
        int[] skaitluMasivs = new int[100];
        int paraSkaitlis = 2;
        for (int k = 0; k < skaitluMasivs.length; k++) {
            skaitluMasivs[k] = paraSkaitlis;
            paraSkaitlis = paraSkaitlis + 2;
        }
        System.out.println(Arrays.toString(skaitluMasivs));
    }
    /////////////////////////////////////////////////////////////////
    private static void tresaisUzdevums() {
        System.out.println("\n" + "3.uzdevums");
        int[] menesaNumurs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] menesaNosaukums = {"Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Jūnijs", "Jūlijs", "Augusts", "Septembris", "Oktobris", "Novembris", "Decembris"};
        char[] menesaSimbols = {'j', 'f', 'm', 'a', 'm', 'j', 'j', 'a', 's', 'o', 'n', 'd' };

        System.out.println("\n" + "Cikls WHILE");
        int menesaNumuriPecKartas = 0;
        while (menesaNumuriPecKartas < menesaNumurs.length) {
            System.out.println(menesaNumurs[menesaNumuriPecKartas]);
            menesaNumuriPecKartas = menesaNumuriPecKartas + 1;
        }

        int menesaNosaukumiPecKartas = 0;
        while (menesaNosaukumiPecKartas < menesaNosaukums.length) {
            System.out.println(menesaNosaukums[menesaNosaukumiPecKartas]);
            menesaNosaukumiPecKartas = menesaNosaukumiPecKartas + 1;
        }
        int simboliPecKartas = 0;
        while (simboliPecKartas < menesaSimbols.length) {
            System.out.println(menesaSimbols[simboliPecKartas]);
            simboliPecKartas = simboliPecKartas + 1;
        }

        System.out.println("\n" + "Cikls DO WHILE");
        int menesaNumuriPecKartas1 = 0;
        do {
            System.out.println(menesaNumurs[menesaNumuriPecKartas1]);
            menesaNumuriPecKartas1 = menesaNumuriPecKartas1 + 1;
        } while (menesaNumuriPecKartas1 < (menesaNumurs.length));

        int menesaNosaukumsPecKartas1 = 0;
        do {
            System.out.println(menesaNosaukums[menesaNosaukumsPecKartas1]);
            menesaNosaukumsPecKartas1 = menesaNosaukumsPecKartas1 + 1;
        } while (menesaNosaukumsPecKartas1 < (menesaNosaukums.length));

        int simboliPecKartas1 = 0;
        do {
            System.out.println(menesaSimbols[simboliPecKartas1]);
            simboliPecKartas1 = simboliPecKartas1 + 1;
        } while (simboliPecKartas1 < (menesaSimbols.length));

        System.out.println("\n" + "Cikls FOR LOOP");
        for (int menesaNumuriPecKartas2 = 0; menesaNumuriPecKartas2 < menesaNumurs.length; menesaNumuriPecKartas2++) {
            System.out.println(menesaNumurs[menesaNumuriPecKartas2]);
        }
        for (int menesaNosaukumiPecKartas2 = 0; menesaNosaukumiPecKartas2 < menesaNosaukums.length; menesaNosaukumiPecKartas2++) {
            System.out.println(menesaNosaukums[menesaNosaukumiPecKartas2]);
        }
        for (int simboliPecKartas2 = 0; simboliPecKartas2 < menesaSimbols.length; simboliPecKartas2++) {
            System.out.println(menesaSimbols[simboliPecKartas2]);
        }
        System.out.println("\n" + "Cikls FOR EACH");
        for (int menesaNumuriPecKartas3 : menesaNumurs) {
            System.out.println(menesaNumuriPecKartas3);
        }
        for (String menesaNosaukumiPecKartas3 : menesaNosaukums) {
            System.out.println(menesaNosaukumiPecKartas3);
        }
        for (char simboliPecKartas3 : menesaSimbols) {
            System.out.println(simboliPecKartas3);
        }
    }
    /////////////////////////////////////////////////////////////////
    private static void otraisUzdevums() {
        System.out.println("\n" + "2.uzdevums");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi veselu skaitli!");
        int skaitlis = scanner.nextInt();
        if(irPirmskaitlis(skaitlis)) {
            System.out.println("Skaitlis " + skaitlis + " ir pirmskaitlis!");
        }
        else{
            System.out.println("Skaitlis " + skaitlis + " nav pirmskaitlis!");
        }
    }
    static boolean irPirmskaitlis(int skaitlis)
    {
        if(skaitlis <= 1)
        {
            return false;
        }
        for(int i = 2; i < skaitlis/2; i++)
        {
            if((skaitlis % i) == 0)
                return  false;
        }
        return true;
    }
    /////////////////////////////////////////////////////////////////
    private static void pirmaisUzdevums() {
        System.out.println("1.uzdevums");
        Scanner scanner = new Scanner(System.in);
        int skaitlis;
        int summa = 0;
        while (summa <= 100){
            System.out.println("Ievadi veselu skaitli: ");
            skaitlis = scanner.nextInt();
            summa = skaitlis + summa;
        }
        System.out.println(summa);
        System.out.println("Gatavs!");
    }

}
