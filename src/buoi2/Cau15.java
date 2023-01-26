package buoi2;

import java.util.Scanner;

public class Cau15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hinh1(5);
        System.out.println();
        hinh2(5);
        System.out.println();
        hinh3(5);
        System.out.println();
        hinh4(5);
        System.out.println();
        hinh5(5);
    }

    public static void hinh1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hinh2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hinh3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void hinh4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void hinh5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; ++j) {
                if (j == 1 || j == i || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
