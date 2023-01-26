package buoi3;

import java.util.Scanner;

public class Cau14 {
    public static boolean primeDivisor(long n) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int mu = 0;
                while (n % i == 0) {
                    mu++;
                    n /= i;
                }
                if (mu < 2)
                    return false;
            }
        }
        if (n != 1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (primeDivisor(i) == true) {
                System.out.print(i + " ");
            }
        }

    }
}
