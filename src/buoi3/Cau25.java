package buoi3;

import java.util.Scanner;

public class Cau25 {
    public static long nCk(int n, int k) {
        long res = 1;
        for (int i = 0; i < k; i++) {
            res = res * (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nCk(i, j) + " ");
            }
            System.out.println("");
        }
    }
}
