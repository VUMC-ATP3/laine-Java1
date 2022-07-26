package main.java.classroom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Laine";
        String uzvards = "Dreismane";
        int vecums = 36;
        boolean isPresent = true;

        System.out.println("Vārds: " + vards + "\n" + "Uzvārds " + uzvards + "\n" + "Vecums" + vecums + "\n"
        + "Vai bija nodarbībā? " + isPresent);

        //%s vards tiks ielikts tajā %s laukā
        String teikums = String.format("Vārds: %s \n Uzvārds %s \n Vecums %s \n isPresent %s",vards,uzvards,vecums,isPresent);
        System.out.println(teikums);

    }
}
