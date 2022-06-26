package classroomFive.encapsulation;

public class Weather {

    boolean isRaining; //varam piekļūt klases un pakotnes līmenī
    public boolean isSunShining; // varam piekļūt visur
    private boolean isSnowing; //varam piekļūt tikai klases ietvaros
    private double temperatureAtDay; //varam piekļūt tikai klases ietvaros
    public double temperatureAtNight; // varam piekļūt visur

    public void printWeather(){

        System.out.println("Šī ir publiska metode");
        System.out.println("Ārā līst lietus voside dienu");
    }

    private void metodeDivi(){
        System.out.println("Šī ir privātā metode");
    }

    void metodeTris(){
        System.out.println("Šī ir default metode");
    }
}
