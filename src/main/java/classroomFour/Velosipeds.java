package main.java.classroomFour;

public class Velosipeds {


    int atrums = 0; //var pielikt arī vērtību, šajā ga'dijumā sākotnējā vērtība būs 0
    char bremzuTips;
    public void spiestPedalus(){
        atrums = atrums + 1; // jeb atrums++
    }
    public void bremzet(){
        if(bremzuTips=='D'){
            atrums = atrums -2;
        }
        else if(bremzuTips=='V'){
            atrums--;
        }
        else{
            System.out.println("Man nav bremžu");
        }
        atrums--;
    }

    public void printetAtrumu(){
        System.out.println(atrums + " km/h");
    }



}
