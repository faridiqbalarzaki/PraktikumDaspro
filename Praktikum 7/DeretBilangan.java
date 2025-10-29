import java.util.Scanner;
public class DeretBilangan {
    
    public static void main(String[] args) {
        
        int jumlah=0;

        for (int i = 25; i >= 1; i--) {
            jumlah = jumlah + i; 
        }

        System.out.println("Hasil bilangan 25 sampai 1 "+ jumlah);
    }
}
