package Jobsheet2.Tugas;

public class DemoPersegi {
    public static void main(String[] args) {

        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 15;
        pp1.lebar = 8;

        System.out.println("=== INFORMASI PERSEGI PANJANG 1 ===");
        pp1.displayInfo();
        System.out.println("Luas     : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());

        System.out.println();
    }
}

