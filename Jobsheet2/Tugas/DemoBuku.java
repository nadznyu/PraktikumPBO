package Jobsheet2.Tugas;

public class DemoBuku {
    public static void main(String[] args) {
        // Instansiasi Objek 1
        Buku buku1 = new Buku();
        buku1.judul = "Laut Bercerita";
        buku1.penulis = "Leila S. Chudori";
        buku1.tahunTerbit = 2017;
        buku1.kategori = "Fiksi Sejarah";

        // Instansiasi Objek 2
        Buku buku2 = new Buku();
        buku2.judul = "Filosofi Teras";
        buku2.penulis = "Henry Manampiring";
        buku2.tahunTerbit = 2019;
        buku2.kategori = "Pengembangan Diri";

        System.out.println("=== DATA AWAL BUKU 1 ===");
        buku1.tampilkanInfo();

        // Melakukan update nilai atribut pada objek buku1
        System.out.println("\n[Melakukan Update Atribut Tahun Terbit Buku 1...]");
        buku1.tahunTerbit = 2018;

        System.out.println("=== DATA BARU BUKU 1 ===");
        buku1.tampilkanInfo();
        buku1.pinjamBuku();

        System.out.println("\n-----------------------------------\n");

        System.out.println("=== DATA BUKU 2 ===");
        buku2.tampilkanInfo();
        buku2.kembalikanBuku();
    }
}


