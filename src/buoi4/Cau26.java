package buoi4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Cau26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.print(i + 1 + " ");
                break;
            }

        }
        for (int j = n - 1; j < n ; j--) {
            if (a[j] == x) {
                System.out.print(j + 1);
                break;
            }
        }
    }
}
