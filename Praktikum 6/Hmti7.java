import java.text.DecimalFormat;
import java.util.Scanner;
public class Hmti7 {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        double publikasi = 300000;
        double dekorasi = 500000;
        double konsumsi = 500000;
        double hadiah = 4000000;
        double oprasional = 500000;
        double honor = 75000;
        double konsumsiPeserta = 75000;
        double pendaftaran = 50000;

        int tim;
        double totalBiaya, danaTotal, danaSponsor;
        double danaPolinemaPersen = 0;

        System.out.print("Masukan Jumlah Tim Pendaftaran: ");
        tim = sc.nextInt();
        
        totalBiaya = publikasi + dekorasi + konsumsi + hadiah + oprasional + (konsumsiPeserta * tim) + (honor * tim);

        System.out.print("Apakah Polinema memberikan dana bantuan? (ya/tidak): ");
        String jawaban = sc.next();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan persentase dana bantuan Polinema (dalam bentuk decimal 0.05 untuk 5%): ");
            danaPolinemaPersen = sc.nextDouble() ;
        }

      
        danaTotal = (totalBiaya * danaPolinemaPersen) + (pendaftaran * tim);
        danaSponsor = totalBiaya - danaTotal;

        System.out.println("\n===== RINCIAN DANA =====");
        System.out.println("Total Biaya Kegiatan     : Rp " + df.format(totalBiaya));
        System.out.println("Dana dari Polinema       : Rp " + (int)(totalBiaya * danaPolinemaPersen));
        System.out.println("Dana dari Pendaftaran    : Rp " + df.format(pendaftaran * tim));
        System.out.println("Dana yang harus dipenuhi : Rp " + df.format(danaSponsor));
    }
}
