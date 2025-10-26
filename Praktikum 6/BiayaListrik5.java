
import java.util.Scanner;
public class BiayaListrik5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double BiayaTetap = 50000;
        double TarifKWH = 1500;
        double ppn = 0.1;
        double JTotal;
        double JKwh;
        double TTarif,potongan;

        System.out.print("Masukan Daya KWH :\n900\n1300\n2200\n3500\n5500\n ");
        JKwh = sc.nextDouble();
        
        TTarif = JKwh * TarifKWH;
        JTotal = (TTarif + BiayaTetap);

        if (JTotal < 100000) {
            System.out.println(" Jumlah yang harus di bayarkan Rp." + (int) JTotal);
        } else {
            System.out.println(" Jumlah harga awal Rp." + (int) JTotal);
            System.out.println("Total yang harus di bayar + PPN Rp." + (int) JTotal*(1+ppn));
        }

    }

}


