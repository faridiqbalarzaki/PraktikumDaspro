import java.util.Scanner;
public class MahasiswaPerempuan {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] nama = new String[30];
        String[] jenisKelamin = new String[30];

        for (int i = 0; i < 30; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();

            System.out.print("Masukkan jenis kelamin (L/P): ");
            jenisKelamin[i] = input.nextLine();
            System.out.println(); 
        }

        System.out.println("==============================");
        System.out.println("Daftar Mahasiswa Perempuan:");
        System.out.println("==============================");

        for (int i = 0; i < 30; i++) {
            if (jenisKelamin[i].equalsIgnoreCase("P")) {
                System.out.println(nama[i]);
            }
        }

        input.close();
    }
}

