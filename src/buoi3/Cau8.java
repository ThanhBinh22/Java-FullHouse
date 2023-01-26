package buoi3;

import java.util.Scanner;

public class Cau8 {
    public static int pt(int n) {
        if (n == 1)
            return 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                return i;
            }
        }
        return n; // n là số nguyên tố
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(pt(i));
        }
    }
}
