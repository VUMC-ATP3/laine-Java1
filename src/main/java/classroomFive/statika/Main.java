package main.java.classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cik auto objekti uztaisiti");
        System.out.println("Cik auto objekti uztaisiti: " +
                Auto.totalCarsCreated);
        Auto masina = new Auto("BMW");
        Auto masinaDivi = new Auto("Mercedes");
        System.out.println("Cik auto objekti uztaisiti: " +
                Auto.totalCarsCreated);
        Auto masina3i = new Auto("Opel");
        Auto masina5i = new Auto("Fiat");
        System.out.println("Cik auto objekti uztaisiti: " +
                Auto.totalCarsCreated);
        Auto.printText();

    }
}

