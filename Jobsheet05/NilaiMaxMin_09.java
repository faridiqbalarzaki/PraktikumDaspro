package Jobsheet05;
import java.util.Scanner;
public class NilaiMaxMin_09 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Masukkan bilangan A: ");
        int A = sc.nextInt();

        System.out.print("Masukkan bilangan B: ");
        int B = sc.nextInt();

        System.out.print("Masukkan bilangan C: ");
        int C = sc.nextInt();

        int Maks, Min;

       
        if ((A >= B) && (A >= C)) {
            Maks = A;
        } else if ((B >= A) && (B >= C)) {
            Maks = B;
        } else {
            Maks = C;
        }

     
        if ((A <= B) && (A <= C)) {
            Min = A;
        } else if ((B <= A) && (B <= C)) {
            Min = B;
        } else {
            Min = C;
        }

        System.out.println("Bilangan maksimum adalah: " + Maks);
        System.out.println("Bilangan minimum adalah: " + Min);

    
    }
}
    
