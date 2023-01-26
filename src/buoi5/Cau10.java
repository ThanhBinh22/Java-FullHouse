package buoi5;

import java.util.Scanner;

public class Cau10 {
    public static double tong5(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1d * 1 / n + tong5(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.3f",tong5(n));
    }
}
