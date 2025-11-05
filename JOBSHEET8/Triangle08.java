package JOBSHEET8;

import java.util.Scanner;

public class Triangle08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {          // perulangan baris
            int j = 1;            // reset j setiap baris baru

            while (j <= i) {      // perulangan kolom
                System.out.print("*");
                j++;
            }
            System.out.println(); // pindah ke baris baru
            i++;                  // lanjut ke baris berikutnya
        }
    }
}
