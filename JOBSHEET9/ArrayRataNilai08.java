import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, rata2;
        int jumlahLulus = 0;
        int TdkLulus = 0;
        int totalLulus = 0, totalTidakLulus = 0;
        double rataLulus = 0, rataTidakLulus = 0;

        System.out.print("Masukan jumlah mahasiswa :");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                TdkLulus++;
            }

        }
        if (jumlahLulus > 0) {
            rataLulus = (double) totalLulus / jumlahLulus;
        }

        if (TdkLulus > 0) {
            rataTidakLulus = (double) totalTidakLulus / TdkLulus;
        }
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("Mahasiswa dengan nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Mahasiswa dengan nilai terendah = " + nilaiTerendah);
        System.out.println("-----------------------------------------");
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

    }
}
