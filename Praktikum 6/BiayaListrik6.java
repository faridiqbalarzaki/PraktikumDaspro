import java.util.Scanner;

public class BiayaListrik6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double BiayaTetap = 50000;
        double TarifKWH = 0;
        double ppn = 0.1;
        double JTotal, TTarif;
        double JKwh;
        int daya;

        System.out.println("Pilih Daya Listrik (VA):");
        System.out.println("1. 900");
        System.out.println("2. 1300");
        System.out.println("3. 2200");
        System.out.println("4. 3500");
        System.out.println("5. 5500");
        System.out.print("Masukkan pilihan (1-5): ");
        daya = sc.nextInt();

        switch (daya) {
            case 1:
                TarifKWH = 1300;
                break;
            case 2:
            case 3:
                TarifKWH = 1500;
                break;
            case 4:
            case 5:
                TarifKWH = 1700;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.print("Masukkan jumlah pemakaian KWh: ");
        JKwh = sc.nextDouble();

        TTarif = JKwh * TarifKWH;
        JTotal = TTarif + BiayaTetap;

        System.out.println("-------------------------------");
        System.out.println("Daya         : " + daya + " VA");
        System.out.println("Tarif/KWh    : Rp " + TarifKWH);
        System.out.println("Pemakaian    : " + JKwh + " KWh");
        System.out.println("Biaya Tetap  : Rp " + BiayaTetap);
        System.out.println("Harga Awal   : Rp " + (int) JTotal);

        if (JTotal < 100000) {
            System.out.println("Total Bayar  : Rp " + (int) JTotal);
        } else {
            double totalPPN = JTotal * (1 + ppn);
            System.out.println("Total + PPN  : Rp " + (int) totalPPN);
        }
    }
}
