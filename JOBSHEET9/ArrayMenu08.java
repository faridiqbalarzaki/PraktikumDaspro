import java.util.Scanner;

public class ArrayMenu08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice" };
        double[] daftarHarga = { 20000, 22000, 15000, 17000, 13000, 18000, 20000 };
        double totalBayar = 0;
        int nomorPesanan = 1;

        int[] daftarPesanan = new int[daftarMenu.length];
        while (true) {

            System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): ");
            int jumlahPesanan = sc.nextInt();
            sc.nextLine();

           
            if (jumlahPesanan == 0) {
                break;
                
            }
             System.out.println("---------- MENU ----------");
            System.out.println("1.Nasi Goreng\t\t5.Roti Bakar\n2.Mie Goreng\t\t6.Cappucino\n3.Kentang Goreng\t7.Teh Tarik\n4.Mie Goreng\t\t8.Chocolate Ice");
            System.out.println("---------------------------");


            for (int p = 0; p < jumlahPesanan; p++) {
                boolean menuValid = false;

                while (!menuValid) {
                    System.out.print("Masukkan menu " + nomorPesanan + ": ");
                    String namaMenu = sc.nextLine();

                    int index = -1;
                    for (int i = 0; i < daftarMenu.length; i++) {
                        if (daftarMenu[i].equalsIgnoreCase(namaMenu)) {
                            index = i;
                            break;
                        }
                    }

                    if (index != -1) {
                        System.out.print("Masukkan jumlah: ");
                        int jumlah = sc.nextInt();
                        sc.nextLine();

                        daftarPesanan[index] += jumlah;
                        double subtotal = jumlah * daftarHarga[index];
                        totalBayar += subtotal;

                        nomorPesanan++;
                        menuValid = true;

                    } else {
                        System.out.println("Menu tidak tersedia. Silakan coba lagi.");
                    }
                }
            }
            System.out.println("--------------------------------");
            System.out.println("Total : " + (int) totalBayar);
            System.out.println("--------------------------------");
        }

        sc.close();
    }
}
