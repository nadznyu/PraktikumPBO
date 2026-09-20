package Jobsheet3.Tugas;

import java.security.PublicKey;

public class Anggota {
    public String nomorKtp;
    public String nama;
    public double limitPinjaman;
    public double jumlahPinjaman;

    public Anggota(String nomorKtp, String nama, double limitpinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitpinjaman;
        this.jumlahPinjaman = 0;
    }

    public String nomorKtp() {
        return nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double besarPinjaman) {
        if (besarPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += besarPinjaman;
        }
    }

    public void angsur(double besarAngsuran) {
        this.jumlahPinjaman -= besarAngsuran;
        if (this.jumlahPinjaman < 0) {
            this.jumlahPinjaman = 0;
        }
    }

}


