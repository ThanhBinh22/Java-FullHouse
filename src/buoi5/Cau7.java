package buoi5;

import java.util.Scanner;

public class Cau7 {
    public static long nCk(int k, int n) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return nCk(k - 1, n - 1) + nCk(k, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(nCk(k, n));
    }
}
