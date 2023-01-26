package buoi3;

import java.util.Scanner;

public class Cau9 {
    public static void ptPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int mu = 0;
                while (n % i == 0) {
                    mu++;
                    n /= i;
                }
                System.out.print(i + "^" + mu);
                if (n != 1)
                    System.out.print(" * ");
            }
        }
        if (n != 1)
            System.out.println(n + "^1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ptPrime(n);
    }
}
