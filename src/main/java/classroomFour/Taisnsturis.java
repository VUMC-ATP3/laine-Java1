package classroomFour;

public class Taisnsturis {
    double malaViens;
    double malaDivi;

    Taisnsturis(double malaViens, double malaDivi){
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
        System.out.println("Taisu taisnstūri");
    }


    public double aprekinatLaukumu(){
        return malaViens * malaDivi;
    }
}
