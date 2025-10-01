import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bP, bK, p, k;

        bP = input.nextInt();
        bK = input.nextInt();
        if (bP % 2 == 0) {
            System.out.println("Bilangan Pertama Genap");
        } else {
            System.out.println("Bilangan Pertama Ganjil");
        }
        if (bK % 2 == 0) {
            System.out.println("Bilangan Kedua Genap");
        } else {
            System.out.println("Bilangan Kedua Ganjil");
        }
        if (bP == bK) {
            System.out.println("Kedua bilangan sama besar");
        } else {
            if (bP > bK) {
                System.out.println("Bilangan Pertama lebih Besar");
                System.out.println("Berbeda jenis");
            } else {
                if (bK > bP) {
                    System.out.println("Bilangan Kedua lebih Besar");
                    System.out.println("Berbeda jenis");
                } else {
                    System.out.println("Bilangan Pertama lebih Kecil");
                    System.out.println("Berbeda jenis");
                }
            }
        }
        p = bP + bK;
        System.out.println(p);
        k = bP * bK;
        System.out.println(k);
    }
}
