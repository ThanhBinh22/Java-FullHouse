package buoi5;

import java.util.Scanner;

public class Cau12 {
    public static void hecxa(long n) {
        if (n == 0) {
            return;
        } else {
            hecxa(n / 16);
            if (n % 16 == 10) {
                System.out.print("A");
            } else if (n % 16 == 11) {
                System.out.print("B");
            } else if (n % 16 == 12) {
                System.out.print("C");
            } else if (n % 16 == 13) {
                System.out.print("D");
            } else if (n % 16 == 14) {
                System.out.print("E");
            } else if (n % 16 == 15) {
                System.out.print("F");
            } else {
                System.out.print(n % 16);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        hecxa(n);
    }
}
