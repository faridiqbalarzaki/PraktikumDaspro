import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 0;
        int hasil = -1;

        System.out.print("Masukan  banyaknya nilai yang akan di input: ");
        int nilai = sc.nextInt();
        int[] arrNilai = new int[nilai];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke- " + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();

        }
        System.out.print("Masukan yang ingin di cari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}
