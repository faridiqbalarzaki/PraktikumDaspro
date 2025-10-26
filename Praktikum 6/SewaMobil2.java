import java.text.DecimalFormat;
import java.util.Scanner;

public class SewaMobil2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double BiayaSewa = 300000;
        double BiayaSupir = 200000;
        double BBM = 1000;
        int LamaSewa;
        double dikson;

        double JarakTempuh, TotalBiaya, Jumlah;
        System.out.print("Masukan Lama Sewa anda (Dalam Hari) :");
        LamaSewa = sc.nextInt();

        System.out.print("Masukan Jarak Tempuh anda (Dalam KM) :");
        JarakTempuh = sc.nextDouble();

        TotalBiaya = (BiayaSewa + BiayaSupir) * LamaSewa;
        Jumlah = (JarakTempuh * BBM) + TotalBiaya;
        if (Jumlah > 2000000) {
            dikson = Jumlah * 0.05;
            System.out.println("Selamat anda mendapatkan dikson 5% Total Biaya Rp." + (Jumlah - dikson));
        } else {
            System.out.println("Total Biaya Rp." + (Jumlah));
        }

    }
}
