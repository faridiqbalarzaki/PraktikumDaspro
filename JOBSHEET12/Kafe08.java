import java.util.Scanner;

public class Kafe08 {
    public static int hitungTotalHarga(int totalHarga, String kodePromo) {

        System.out.println("Total sebelum diskon: Rp " + totalHarga);

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid! Diskon 50% diterapkan!");
            totalHarga *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid! Diskon 30% diterapkan!");
            totalHarga *= 0.7;
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        System.out.print("Masukkan kode promo (DISKON50/DISKON30): ");
        String kodePromo = sc.nextLine();

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam  - Rp 15.000");
        System.out.println("2. Cappucino   - Rp 20.000");
        System.out.println("3. Latte       - Rp 22.000");
        System.out.println("4. Teh Tarik   - Rp 12.000");
        System.out.println("5. Roti Bakar  - Rp 10.000");
        System.out.println("6. Mie Goreng  - Rp 18.000");
        System.out.println("===========================\n");

        int totalSemuaPesanan = 0;

        System.out.print("Berapa jenis menu yang ingin dipesan? ");
        int jumlahJenisMenu = sc.nextInt();

        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu: ");
            int pilihan = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyak = sc.nextInt();

            int total = hargaItems[pilihan - 1] * banyak;
            System.out.println("Subtotal pesanan ini: Rp " + total);

            totalSemuaPesanan += total;
        }

        System.out.println("\n====================================");
        System.out.println("Total seluruh pesanan: Rp " + totalSemuaPesanan);
        int totalBayar = hitungTotalHarga(totalSemuaPesanan, kodePromo);

        System.out.println("\nTotal akhir yang harus dibayar: Rp " + totalBayar);
        System.out.println("====================================");
    }
}
