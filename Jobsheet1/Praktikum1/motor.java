package Jobsheet1.Praktikum1;

public class motor {
    static void nyalakanMesin(String merk) {
        System.out.println("Mesin " + merk + " sedang dinyalakan.");
    }

    static void motorberhenti(String merk) {
        System.out.println("Motor " + merk + " sedang berhenti.");
    }

    public static void main(String[] args) {
        String merekMotor1 = "Yamaha Mio 50";
        String warnaMotor1 = "Mocha Latte";
        String ccMotor1 = "50 cc";

        String merekMotor2 = "Honda Revo";
        String warnaMotor2 = "Galaxy Blue";
        String ccMotor2 = "110 cc";

        String merekMotor3 = "Honda Scoopy";
        String warnaMotor3 = "Fashion Cream";
        String ccMotor3 = "125 cc";

        String merekMotor4 = "Yamaha NMAX 150";
        String warnaMotor4 = "Ceramic Grey";
        String ccMotor4 = "150 cc";

        String merekMotor5 = "Honda Vario 160";
        String warnaMotor5 = "Glossy White Red";
        String ccMotor5 = "160 cc";

        String merekMotor6 = "Yamaha R25";
        String warnaMotor6 = "Metallic Black";
        String ccMotor6 = "250 cc";

        String merekMotor7 = "Honda CB500X";
        String warnaMotor7 = "Grand Prix Red";
        String ccMotor7 = "500 cc";

        String merekMotor8 = "Yamaha YZF-R6";
        String warnaMotor8 = "Racing Blue";
        String ccMotor8 = "600 cc";

        String merekMotor9 = "Kawasaki Ninja ZX-10R";
        String warnaMotor9 = "Lime Green";
        String ccMotor9 = "1000 cc";

        String merekMotor10 = "BMW R18";
        String warnaMotor10 = "Blackstorm Metallic";
        String ccMotor10 = "1800 cc";

        System.out.println("===== DATA MOTOR =====");

        System.out.println("\nMotor 1");
        System.out.println("Merek Motor: " + merekMotor1);
        System.out.println("Warna Motor: " + warnaMotor1);
        System.out.println("CC Motor: " + ccMotor1);

        System.out.println("\nMotor 2");
        System.out.println("Merek Motor: " + merekMotor2);
        System.out.println("Warna Motor: " + warnaMotor2);
        System.out.println("CC Motor: " + ccMotor2);

        System.out.println("\nMotor 3");
        System.out.println("Merek Motor: " + merekMotor3);
        System.out.println("Warna Motor: " + warnaMotor3);
        System.out.println("CC Motor: " + ccMotor3);

        System.out.println("\nMotor 4");
        System.out.println("Merek Motor: " + merekMotor4);
        System.out.println("Warna Motor: " + warnaMotor4);
        System.out.println("CC Motor: " + ccMotor4);

        System.out.println("\nMotor 5");
        System.out.println("Merek Motor: " + merekMotor5);
        System.out.println("Warna Motor: " + warnaMotor5);
        System.out.println("CC Motor: " + ccMotor5);

        System.out.println("\nMotor 6");
        System.out.println("Merek Motor: " + merekMotor6);
        System.out.println("Warna Motor: " + warnaMotor6);
        System.out.println("CC Motor: " + ccMotor6);

        System.out.println("\nMotor 7");
        System.out.println("Merek Motor: " + merekMotor7);
        System.out.println("Warna Motor: " + warnaMotor7);
        System.out.println("CC Motor: " + ccMotor7);

        System.out.println("\nMotor 8");
        System.out.println("Merek Motor: " + merekMotor8);
        System.out.println("Warna Motor: " + warnaMotor8);
        System.out.println("CC Motor: " + ccMotor8);

        System.out.println("\nMotor 9");
        System.out.println("Merek Motor: " + merekMotor9);
        System.out.println("Warna Motor: " + warnaMotor9);
        System.out.println("CC Motor: " + ccMotor9);

        System.out.println("\nMotor 10");
        System.out.println("Merek Motor: " + merekMotor10);
        System.out.println("Warna Motor: " + warnaMotor10);
        System.out.println("CC Motor: " + ccMotor10);

        System.out.println("\n===== AKSI MOTOR =====");
        nyalakanMesin(merekMotor1);
        nyalakanMesin(merekMotor6);

        motorberhenti(merekMotor1);
        motorberhenti(merekMotor6);
    }

}
