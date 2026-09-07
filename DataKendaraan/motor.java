package DataKendaraan;

public class motor {
    String merk;
    String jenisTransmisi;

    public motor(String merk, String jenisTransmisi) {
        this.merk = merk;
        this.jenisTransmisi = jenisTransmisi;
    }

    public void tampilkanInfo() {
        System.out.println("Merk Motor: " + merk);
        System.out.println("Jenis Transmisi: " + jenisTransmisi);
    }
}
    