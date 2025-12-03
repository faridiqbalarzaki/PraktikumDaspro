import java.util.Scanner;

public class NilaiMahasiswa08 {
    public static void isiNilai(int[] nilai) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    public static void tampilNilai(int[] nilai) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int n : nilai) {
            System.out.println(n);
        }
    }

    public static int totalNilai(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa jumlah mahasiswa? ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        isiNilai(nilai);
        tampilNilai(nilai);

        int total = totalNilai(nilai);
        System.out.println("Total seluruh nilai: " + total);
    }
}
