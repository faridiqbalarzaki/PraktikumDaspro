import java.text.DecimalFormat;
import java.util.Scanner;

public class SewaMobil3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double BiayaSewa = 300000;
        double BiayaSupir = 200000;
        double BBM = 1000;
        int LamaSewa;

        double JarakTempuh, TotalBiaya, Jumlah;
        System.out.print("Masukan Lama Sewa anda (Dalam Hari) :");
        LamaSewa = sc.nextInt();
        if (LamaSewa > 30) {
            System.out.println("Lama sewa maksimal 30 hari");
        } else {
            System.out.print("Masukan Jarak Tempuh anda (Dalam KM) :");
            JarakTempuh = sc.nextDouble();

            TotalBiaya = (BiayaSewa + BiayaSupir) * LamaSewa;
            Jumlah = (JarakTempuh * BBM) + TotalBiaya;
            System.out.println("Total Biaya Rp." + (Jumlah));
        }

    }
}
