import java.text.DecimalFormat;
import java.util.Scanner;

public class SewaMobil1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double BiayaSewa = 300000;
        double BiayaSupir = 200000;
        double BBM = 1000;
        String Bahanbakar;

        int LamaSewa;

        double JarakTempuh, TotalBiaya, Jumlah;
        System.out.print("Masukan Lama Sewa anda (Dalam Hari) :");
        LamaSewa = sc.nextInt();
        System.out.print("Masukan Jarak Tempuh anda (Dalam KM) :");
        JarakTempuh = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan bahan bakar yang di pilih (pertalit/pertamax)");
        Bahanbakar = sc.nextLine();

        if (Bahanbakar.equalsIgnoreCase("pertalit")) {
            BBM = 1000;
            TotalBiaya = (BiayaSewa + BiayaSupir) * LamaSewa;
            Jumlah = (JarakTempuh * BBM) + TotalBiaya;
            System.out.println("Total Biaya Rp." + (Jumlah));
        } else if (Bahanbakar.equalsIgnoreCase("pertamax")) {
            BBM = 1300;
            TotalBiaya = (BiayaSewa + BiayaSupir) * LamaSewa;
            Jumlah = (JarakTempuh * BBM) + TotalBiaya;
            System.out.println("Total Biaya Rp." + (Jumlah));
        }

    }
}
