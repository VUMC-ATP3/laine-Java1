package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Ievadi savu vārdu!");
        // String name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu!");
        //int age = scanner.nextInt();
        //System.out.println("Jūsu vecums ir: " + age);

        //System.out.println("Ievadi vienu ciparu!");
        //int aa = scanner.nextByte();
        //System.out.println("Ievadi vēl vienu ciparu!");
        //int bb = scanner.nextByte();
        //int summa = aa + bb;
        //System.out.println("Skaitļu summa ir: "+ summa);

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;
        System.out.println(b > a); //true
        System.out.println(a > b); //false
        //Mazāks <
        System.out.println(a < b);//true
        System.out.println(b < a); //false
        //Vienāds =
        System.out.println(a == c); //true
        System.out.println(b == c); //false
        System.out.println(b == a); //false
        //Nav vienāds !=
        System.out.println(a != b); //true
        System.out.println(a != c); //false
        //Mazāks vienāds <=
        System.out.println(a <= c); //true
        //Lielāks vienāds >=
        System.out.println(b >= d); //false

        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks drīkst balsot" + vaiDrikstBalsot);


        int e = 4;

        boolean vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = (!(e < 5));


        System.out.println("Ievadi savu vecumu!");
        int vecumsDivi = scanner.nextInt();
        if (vecumsDivi >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }

        System.out.println("Ievadi skaitli!");
        int skaitlisViens = scanner.nextInt();
        if (skaitlisViens == 10) {
            System.out.println("Skaitlis ir desmit!");
        } else if (skaitlisViens == 15) {
            System.out.println("Skaitlis ir piedsmatsmit!");
        } else if (skaitlisViens == 20) {
            System.out.println("Skaitlis ir divdesmit");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }

        //Jānodefinē vecums
       // int vecumsPensija = 59;
       // char dzimums = 'S';

       // if (dzimums == 'V' && vecumsPensija >= 65) {
        //    System.out.println("Vīrieši drīkst doties pensijā no 65");
       // } else if (dzimums == 'S' && vecumsPensija >= 60) {
        //    System.out.println("Sievietes drīkst doties pensijā no 60");
       // } else {
          //  System.out.println("Jūs nedrīkstat doties pensijā");


       // }
        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        }
        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
            drikstDotiesPensija = true;
        }

        if(drikstDotiesPensija){
            System.out.println("Cilveks drikst doties pensija!");
        }

        int diena = 8;
        String dienasVards;

        switch(diena){
            case 1:
                dienasVards="Pirmdiena";
                break;
            case 2:
                dienasVards="Otrdiena";
                break;
            case 3:
                dienasVards="Trešdiena";
                break;
            case 4:
                dienasVards="Ceturtdiena";
                break;
            case 5:
                dienasVards="Piektdiena";
                break;
            case 6:
                dienasVards="Sestdiena";
                break;
            case 7:
                dienasVards="Svētdiena";
                break;
            default:
                dienasVards="Nezināma diena";
        }
        System.out.println(dienasVards);

        System.out.println("Ievadi veselu skaitli!");
        int veselsSkaitlis = scanner.nextInt();
        if (veselsSkaitlis == 0) {
            System.out.println("Skaitlis ir 0");
        } else if (veselsSkaitlis < 0) {
            System.out.println("Skaitlis ir lielāks par 0");
        } else {
            System.out.println("Skaitlis ir mazāks par 0");
        }
        //int skaitlis;
        //        try {
        //            skaitlis = scanner.nextInt();
        //            if (skaitlis > 0) {
        //                System.out.println("Lielaks par 0");
        //            } else if (skaitlis < 0){
        //                System.out.println("Mazaks par 0");
        //            } else{
        //                System.out.println("Skaitlis ir 0");
        //            }
        //        }
        //        catch (InputMismatchException e){
        //            System.out.println("Tas nav skaitlis");
        //        }

        int skaitlisJauns = 4;
        if(skaitlisJauns%2==0) { //skaitlis dalās ar 2 un nav atlikuma
            System.out.println("Skaitlis ir pāra skaitlis");
        }else {
                System.out.println("Skaitlis ir nepāra skailtis");
            }




        }
    }

