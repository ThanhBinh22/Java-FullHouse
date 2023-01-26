package buoi6;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Hình 1:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Hình 2:");
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Hình 3:");
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Hình 4:");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
