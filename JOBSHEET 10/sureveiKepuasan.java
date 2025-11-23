import java.util.Scanner;

public class sureveiKepuasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        int[][] hasilSurvei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        // A. INPUT DATA SURVEI
        System.out.println("=== Input Data Survei ===");

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                System.out.print("Jawaban Pertanyaan " + (j + 1) + " (1-5): ");
                hasilSurvei[i][j] = sc.nextInt();
            }

            System.out.println();
        }

        // B. RATA-RATA PER RESPONDEN
        System.out.println("=== Rata-rata Setiap Responden ===");

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {

            int total = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                total += hasilSurvei[i][j];
            }

            double rata = (double) total / JUMLAH_PERTANYAAN;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        // C. RATA-RATA PER PERTANYAAN
        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");

        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {

            int total = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                total += hasilSurvei[i][j];
            }

            double rata = (double) total / JUMLAH_RESPONDEN;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        // D. RATA-RATA KESELURUHAN
        System.out.println("\n=== Rata-rata Keseluruhan ===");

        int totalSemua = 0;
        int jumlahData = JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN;

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalSemua += hasilSurvei[i][j];
            }
        }

        double rataTotal = (double) totalSemua / jumlahData;
        System.out.println("Rata-rata seluruh survei: " + rataTotal);
    }
}
