package classroomFive.polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5,4));
        System.out.println(calc.sum(4.3, 5.5));
        System.out.println(calc.sum(1,3,4));
        System.out.println(calc.sum(1,2,3,5.5));

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.move();
        motorcycle.move();
        car.stop();
        motorcycle.stop();

    }
}
