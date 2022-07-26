package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trijsturis trissturisViens = new Trijsturis();
        trissturisViens.a = 5;
        trissturisViens.b = 9;
        trissturisViens.c = 6;
        trissturisViens.printTrijsturis();
        System.out.println("Vai trijstūris ir vienādmalu: " + trissturisViens.irVienadmalu());
        System.out.println("Vai trijstūris ir vienādsānu: " + trissturisViens.irVienadsanu());

        Trijsturis trissturisDivi = new Trijsturis(6,7,6);
        trissturisDivi.printTrijsturis();
        System.out.println("Trijstūra laukums = " + trissturisDivi.laukums);
        System.out.println("Vai trijstūris ir vienādmalu: " + trissturisDivi.irVienadmalu());
        System.out.println("Vai trijstūris ir vienādsānu: " + trissturisDivi.irVienadsanu());
    }
}
