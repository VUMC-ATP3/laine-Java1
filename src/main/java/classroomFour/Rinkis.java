package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    final double PI = 3.14; //Math.PI gadījumā, šo tad var nedefinēt
    double radiuss;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;

    //kontruktors
    Rinkis() {
        System.out.println("Mēs veidojam Riņķi..");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);
    }
//2.konstuktora veids
    Rinkis(double padotaisRadiuss){
        radiuss = padotaisRadiuss;
    }

    public void printCreatedTime(){
        System.out.println(timestamp);
    }


    public double aprekinatLaukumu(){
        return Math.pow(radiuss, 2) * Math.PI; // jeb return radiuss * radiuss * PI;
    }

    public double aprekinatRinkaLinijasGarumu(){
        return 2 * Math.PI * radiuss;
    }
}
