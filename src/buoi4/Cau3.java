package buoi4;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0, product = 1;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            sum %= 1000000007;
        }
        for (int i = 0; i < n; i++) {
            product *= a[i];
            product %= 1000000007;
        }

        System.out.println(sum % 1000000007);
        System.out.println(product % 1000000007);

    }
}
