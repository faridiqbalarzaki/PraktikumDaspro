package dasproJobsheet7;

import java.util.Scanner;

public class pengelolaBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        double totalHarga = 0, diskon, totalPenjualan = 0;
        int totalTiketTerjual = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (Masukkan '0' untuk berhenti): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Coba lagi.\n");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }
            double totalSebelumDiskon = jumlahTiket * hargaTiket;
            double jumlahDiskon = totalSebelumDiskon * diskon;
            totalHarga = totalSebelumDiskon - jumlahDiskon;
            System.out.println("-----------------------------------");
            System.out.println("Total sebelum diskon : Rp " + (int) totalSebelumDiskon);
            System.out.println("Diskon               : Rp " + (int) jumlahDiskon);
            System.out.println("Total yang harus dibayar: Rp " + (int) totalHarga);
            System.out.println("-----------------------------------\n");
            totalPenjualan += totalHarga;
            totalTiketTerjual += jumlahTiket;
        }
        System.out.println("========== REKAP PENJUALAN ==========");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total penjualan     : Rp " + (int) totalPenjualan);
        System.out.println("=====================================");
    }
}
