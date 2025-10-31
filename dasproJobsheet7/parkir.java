package dasproJobsheet7;

import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        double total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) { // mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // motor
                    total += durasi * 2000;
                }

            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!\n");
            }

        } while (jenis != 0);

        System.out.println("----------------------------------");
        System.out.println("Total pembayaran parkir hari ini: Rp " + (int) total);
        System.out.println("----------------------------------");
    }
}
