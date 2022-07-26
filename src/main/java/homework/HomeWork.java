package homework;

public class HomeWork {
    public static void main(String[] args) {
        String country1 = "Latvia";
        String capitalCountry1 = "Riga";
        String officialLanguageCountry1 = "Latvian";
        int populationCountry1 = 1907675;
        float totalAreaCountry1 = 64.589F;
        boolean eurozone = true;
        char currencyCountry1 = '€';

        System.out.println("Country");
        System.out.println(country1 + "\n");
        System.out.println("Capital");
        System.out.println(capitalCountry1 + "\n");
        System.out.println("Official Language");
        System.out.println(officialLanguageCountry1 + "\n");
        System.out.println("Population");
        System.out.println(populationCountry1 + "\n");
        System.out.println("Area");
        System.out.println(totalAreaCountry1 + " km2" + "\n");
        System.out.println("Is eurozone country?");
        System.out.println(eurozone + "\n");
        System.out.println("Currency");
        System.out.println(currencyCountry1 + "\n");

        String country2 = "Estonia";
        String capitalCountry2 = "Tallinn";
        String officialLanguageCountry2 = "Estonian";
        int populationCountry2 = 1331796;
        float totalAreaCountry2 = 45.339F;
        char currencyCountry2 = '€';

        System.out.println("Country: " + country2 + "\n" + "Capital: " + capitalCountry2 + "\n" + "Official Language: " + officialLanguageCountry2 + "\n"
                + "Population: " + populationCountry2 + "\n" + "Area: " + totalAreaCountry2 + " km2" + "\n" + "Is eurozone country? " + eurozone + "\n"
                + "Currency: " + currencyCountry2 + "\n");

        int totalPopulation;
        int differencePopulation;

        totalPopulation = populationCountry1 + populationCountry2;

        System.out.println("Total population in both countries:");
        System.out.println(totalPopulation);
        System.out.println("Which country has the largest population? ");
        if (populationCountry1 > populationCountry2) {
            differencePopulation = populationCountry1 - populationCountry2;
            System.out.println("Latvia");
        } else {
            differencePopulation = populationCountry2 - populationCountry1;
            System.out.println("Estonia");
        }
        System.out.println("Difference:");
        System.out.println(differencePopulation + "\n");

        float totalArea;
        float differenceArea;

        totalArea = totalAreaCountry1 + totalAreaCountry2;

        System.out.println("Total area in both countries:");
        System.out.println(totalArea + " km2");
        System.out.println("Which country area is the largest? ");
        if (totalAreaCountry1 > totalAreaCountry2) {
            differenceArea = totalAreaCountry1 - totalAreaCountry2;
            System.out.println("Latvia");
        } else {
            differenceArea = totalAreaCountry2 - totalAreaCountry1;
            System.out.println("Estonia");
        }
        System.out.println("Difference:");
        System.out.println(differenceArea + " km2");
    }
}