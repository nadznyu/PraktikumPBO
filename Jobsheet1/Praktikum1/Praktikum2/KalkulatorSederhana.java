package Jobsheet1.Praktikum1.Praktikum2;

import java.util.Scanner;
public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.print("Masukkan angka pertama : ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /) : ");
        String operator = input.next();

        System.out.print("Masukkan angka kedua : ");
        double angka2 = input.nextDouble();
        System.out.println();

        double hasil;

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                return;
        }

        System.out.println("===== HASIL PERHITUNGAN =====");
        System.out.println("Input : " + angka1 + " " + operator + " " + angka2);
        System.out.println("Hasil : " + hasil);
    }
}
