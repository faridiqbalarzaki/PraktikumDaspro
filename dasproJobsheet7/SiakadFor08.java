package dasproJobsheet7;
import java.util.Scanner;
public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++){
        System.out.print("Masukan Nilai Mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi){
          tertinggi = nilai;
        }
        if (nilai < terendah){
          terendah = nilai;
        }
      
        if (nilai >= 60) {
                System.out.println("Mahasiswa ke-" + i + " LULUS");
            } else {
                System.out.println("Mahasiswa ke-" + i + " TIDAK LULUS");
            }

            System.out.println();
        
      }
    System.out.println("Nilai tertinggi: "+ tertinggi);
    System.out.println("Nilai terendah: "+ terendah);
  }
}