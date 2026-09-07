package DataKendaraan;

public class mobil {
    String merk;
    int jumlahPintu;

    public mobil(String merk, int jumlahPintu) {
        this.merk = merk;
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
