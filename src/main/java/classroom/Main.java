package main.java.classroom;

public class Main {
    public static void main(String[] args) {
        String vardsSuns = "Reksis";
        int vecumsSuns = 3;
        double svarsSuns = 5.5;
        float augstumsSuns = 105.5F;
        char dzimumsSuns = 'V';

        System.out.println("Mans suns");
        System.out.println("Vards");
        System.out.println(vardsSuns);
        System.out.println("Vecums");
        System.out.println(vecumsSuns);
        System.out.println("Svars");
        System.out.println(svarsSuns + " kg");
        System.out.println("Augstums");
        System.out.println(augstumsSuns + " cm");
        System.out.println();
        String vardsKakis = "Minka";
        int vecumsKakis = 5;
        double svarsKakis = 2.5;
        float augstumsKakis = 30.5F;

        System.out.println("Mans kakis");
        System.out.println("Vards");
        System.out.println(vardsKakis);
        System.out.println("Vecums");
        System.out.println(vecumsKakis);
        System.out.println("Svars");
        System.out.println(svarsKakis + " kg");
        System.out.println("Augstums");
        System.out.println(augstumsKakis + " cm");
        System.out.println();
        System.out.println("Kopējais mājdzīvnieku svars");
        System.out.println(svarsSuns + svarsKakis + " kg" + "\n");

        boolean isHungry=true;
        System.out.println("Vai mājdzīvnieki ir izsalkuši?");
        System.out.println(isHungry);

        System.out.println();

        byte monthsInYear = 12;
        short autoPrice = 12345;
        long netIncome = 21321415477879896L;
        System.out.println(monthsInYear + "\n" + autoPrice + "\n" + netIncome);

        int summa;
        int starpība;
        int reizinājums;
        double dalījums;
        int x = 5;
        double z = 5;
        int y = 10;
        double q = 10;

        summa = x+y;
        starpība = x-y;
        reizinājums = x*y;
        dalījums =q/z;
        System.out.println("SUMMA "  + summa);
        System.out.println("STARPĪBA "  + starpība);
        System.out.println("REIZINĀJUMS "  + reizinājums);
        System.out.println("DALĪJUMS "  + dalījums);

        int atlikums;
        atlikums = 12%5;
        System.out.println("ATLIKUMS "  + 12%5);
    }


}
