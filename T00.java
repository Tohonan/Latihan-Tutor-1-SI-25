// 12S25036 - TOHONAN EMMANUELLE SILABAN

import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bP, bK, j, k;

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
            } else {
                if (bK > bP) {
                    System.out.println("Bilangan Kedua lebih Besar");
                } else {
                    System.out.println("Bilangan Pertama lebih Kecil");
                }
            }
        }
        if (bP % 2 == 0 && bK % 2 == 0) {
            j = bK + bP;
            System.out.println("Jumlah Bilangan" + j);
        } else {
            if (bP % 2 != 1 && bK % 2 != 1 && bP % 2 == 0 && bK % 2 == 0) {
                System.out.println("Berbeda Jenis");
            } else {
                k = bP * bK;
                System.out.println("Perkalian" + k);
            }
        }
    }
}
