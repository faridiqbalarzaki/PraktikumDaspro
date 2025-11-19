import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        int menu;
        while (true) {

            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama penonton: ");
                String nama = sc.nextLine();

                System.out.print("Masukkan baris (1-4): ");
                int baris = sc.nextInt();

                System.out.print("Masukkan kolom (1-2): ");
                int kolom = sc.nextInt();
                sc.nextLine();
                penonton[baris - 1][kolom - 1] = nama;

                System.out.println("Data berhasil dimasukkan!");

            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {

                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;

            } else {
                System.out.println("Menu tidak valid. Coba lagi!");
            }
        }

        sc.close();
    }
}
