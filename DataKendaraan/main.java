package DataKendaraan;

public class main {
    public static void main(String[] args) {
        kendaraan k  = new kendaraan("Toyota", "Merah", 2021);
        k.merk = "Toyota";
        k.warna = "Merah";
        k.tahun = 2021;

        mobil m = new mobil("Honda", 4);
        m.merk = "Honda";
        m.jumlahPintu = 4;

        motor mo = new motor("Yamaha", "Manual");
        mo.merk = "Yamaha";
        mo.jenisTransmisi = "Manual";

        System.out.println("=== DATA KENDARAAN ===");
        k.tampilkanInfo();

        System.out.println("\n=== DATA MOBIL ===");
        m.tampilkanInfo();

        System.out.println("\n=== DATA MOTOR ===");
        mo.tampilkanInfo();
}
}