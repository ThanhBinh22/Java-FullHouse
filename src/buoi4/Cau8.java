package buoi4;

import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (1l*a[0] * a[1] < 0){
            System.out.print(a[0] + " ");
        }
        for (int i = 1; i < n - 1; i++) {
            if (1l*a[i] * a[i - 1] < 0 || a[i] * a[i + 1] < 0){
                System.out.print(a[i] + " ");
            }
        }
        if (1l*a[n - 1] * a[n - 2] < 0){
            System.out.print(a[n - 1]);
        }
    }
}
