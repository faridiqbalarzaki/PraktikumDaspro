import java.util.Scanner;

public class RekapPenjualan08 {

    // Daftar menu
    static String[] menu = {
            "Kopi",
            "Teh",
            "Es Kelapa Muda",
            "Roti Bakar",
            "Gorengan"
    };

    // Data penjualan (5 menu × 7 hari)
    static int[][] penjualan = new int[5][7];

    // Mengisi data penjualan
    public static void isiData() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Data Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan penjualan untuk menu: " + menu[i]);

            for (int hari = 0; hari < 7; hari++) {
                System.out.print("  Hari ke-" + (hari + 1) + ": ");
                penjualan[i][hari] = input.nextInt();
            }
            System.out.println();
        }
    }

    // Menampilkan data penjualan
    public static void tampilData() {
        System.out.println("\n=== Tabel Penjualan ===");

        System.out.print("Menu\t\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");

            // Agar kolom rapi (karena panjang teks beda)
            if (menu[i].length() < 8) {
                System.out.print("\t");
            }

            for (int hari = 0; hari < 7; hari++) {
                System.out.print(penjualan[i][hari] + "\t");
            }
            System.out.println();
        }
    }

    // Cari menu yang paling laris
    public static void menuTerlaris() {

        int totalTerbesar = 0;
        String namaMenuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            // Hitung total penjualan 1 menu dalam 7 hari
            for (int hari = 0; hari < 7; hari++) {
                total += penjualan[i][hari];
            }

            // Cek apakah total lebih besar dari sebelumnya
            if (total > totalTerbesar) {
                totalTerbesar = total;
                namaMenuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu paling laris: " + namaMenuTerlaris + " (Total: " + totalTerbesar + ")");
    }

    // Menghitung rata-rata penjualan
    public static void rataRataMenu() {
        System.out.println("\n=== Rata-rata Penjualan ===");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            for (int hari = 0; hari < 7; hari++) {
                total += penjualan[i][hari];
            }

            double rata = total / 7.0;

            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {

        isiData();
        tampilData();
        menuTerlaris();
        rataRataMenu();
    }
}
