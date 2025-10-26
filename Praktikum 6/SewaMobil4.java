import java.text.DecimalFormat;
import java.util.Scanner;

public class SewaMobil4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        double BiayaSewa = 300000;
        double BiayaSupir = 200000;
        double BBM;
        double diskon;
        int LamaSewa;
        double JarakTempuh, TotalBiaya, Jumlah;
        String Bahanbakar;

        System.out.print("Masukan Lama Sewa anda (Dalam Hari): ");
        LamaSewa = sc.nextInt();

        if (LamaSewa > 30) {
            System.out.println("Lama sewa maksimal 30 hari.");
            sc.close();
            return;
        } else if (LamaSewa <= 0) {
            System.out.println("Lama sewa harus lebih dari 0 hari.");
            sc.close();
            return;
        }

        System.out.print("Masukan Jarak Tempuh anda (Dalam KM): ");
        JarakTempuh = sc.nextDouble();
        sc.nextLine();

        System.out.print("Masukan bahan bakar yang dipilih (pertalit/pertamax): ");
        Bahanbakar = sc.nextLine();

        if (Bahanbakar.equalsIgnoreCase("pertalit")) {
            BBM = 1000;
        } else if (Bahanbakar.equalsIgnoreCase("pertamax")) {
            BBM = 1300;
        } else {
            System.out.println("Jenis bahan bakar tidak dikenali!");
            sc.close();
            return;
        }

        TotalBiaya = (BiayaSewa + BiayaSupir) * LamaSewa;
        Jumlah = TotalBiaya + (JarakTempuh * BBM);
        if (Jumlah > 2000000) {
            diskon = Jumlah * 0.05;
            System.out.println("\n Selamat! Anda mendapatkan diskon 5%");
            System.out.println("Total Biaya Sebelum Diskon: Rp. " + df.format(Jumlah));
            System.out.println("Total Biaya Setelah Diskon : Rp. " + df.format(Jumlah - diskon));
        } else {
            System.out.println("\nTotal Biaya: Rp. " + df.format(Jumlah));
        }

        sc.close();
    }
}
