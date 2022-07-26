package homework;
import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {
        pirmaisUzdevums(10,7);
        otraisUzdevums(8);
        trešaisUzdevums();
        ceturtaisUzdevums("Red");
        //5.uzdevums
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
       //6.uzdevums
        printBusinessCardTwo("Janis", "Liepa", "123456789", 1985);
        printBusinessCardTwo("Ausma", "Daugava", "987654321", 1999);
        //7.uzdevums
        int summa = sum(5,5);
        System.out.println(summa);
        //8.uzdevums
        System.out.println("Average=" + (average(5,5,5)));
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
    /////////////////////////////////////////////////////////////////////////////////
    static void printBusinessCardTwo(String name, String surname, String telephone, int birthYear) {
        System.out.println("Business Card" + "\n" + "##########" + "\n" + "Name: " + name + "\n" + "Surname: " +
                surname + "\n" + "Telephone: " + telephone + "\n" + "Birth Year: " + birthYear + "\n" + "##########");
    }
    /////////////////////////////////////////////////////////////////////////////////
    private static void printBusinessCard() {
            String businessCard = "Vizītkarte";
            String hash = "##########";
            String name = "Laine";
            String surname = "Dreismane";
            String telephone = "+371 123456789";
            int birthYear = 1985;
            System.out.println(businessCard + "\n" + hash + "\n" + "Name: " + name + "\n" + "Surname: " + surname + "\n"
                    + "Telephone: " + telephone + "\n" + "Birth Year: " + birthYear + "\n" + hash);
    }
    /////////////////////////////////////////////////////////////////////////////////
    private static <string> void ceturtaisUzdevums(string color){
        if (color.equals("Red")) {
            System.out.println("It's red - stop and wait!");
        } else if (color.equals("Yellow")) {
            System.out.println("It's yellow - wait!");
        } else if (color.equals("Green")) {
            System.out.println("It's green - go!");
        } else {
            System.out.println("It's not red/yellow/red - if it's safe and road is free you can move forward!");
        }
    }
/////////////////////////////////////////////////////////////////////////////////
    private static void trešaisUzdevums() {
        Scanner scan = new Scanner(System.in);

        int a, b, c, largest;

        System.out.print("Enter the First Number: ");
        a = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        b = scan.nextInt();
        System.out.print("Enter the Third Number: ");
        c = scan.nextInt();

        largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

        System.out.println("\nLargest = " + largest);

        System.out.print("Enter the First Number: ");
        a = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        b = scan.nextInt();
        System.out.print("Enter the Third Number: ");
        c = scan.nextInt();

        if(a>=b && a>=c)
            System.out.println(a+" is the largest Number");
        else if (b>=a && b>=c)
            System.out.println(b+" is the largest Number");
        else
            System.out.println(c+" is the largest number");
    }
    /////////////////////////////////////////////////////////////////////////////////
    private static void otraisUzdevums(int month) {
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Unknown month";
        }
        System.out.println(monthName);
    }
    /////////////////////////////////////////////////////////////////////////////////
    private static void pirmaisUzdevums(int x, int y) {

        System.out.println(x > 0); //true
        System.out.println(x < 0);//false
        System.out.println((x > 5) && (x <= 10)); //true
        System.out.println((y <= 5) && (y < 10)); //true
        System.out.println((y == 0) && (y == 10)); //false
        System.out.println(x*x > 10); //true
    }

}
