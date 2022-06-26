package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
//        weather.metodeDivi(); nevar izsaukt, jo metode ir privāta
        weather.metodeTris();

        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12, 154, "Peteris");

        System.out.println(cilveks3.toString());
        cilveks3.setAge(18);

        cilveks3.setAge(-3);
        System.out.println(cilveks3.toString());
        cilveks3.setAge(18);
        System.out.println(cilveks3.toString());


        System.out.println(cilveks3.getAge());

        System.out.println(cilveks3.getName());


    }
}
