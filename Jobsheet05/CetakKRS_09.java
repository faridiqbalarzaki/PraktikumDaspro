package Jobsheet05;
import java.util.Scanner;
public class CetakKRS_09 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);


        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");

     }else{
        System.out.print("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
     }
        
    }
}
