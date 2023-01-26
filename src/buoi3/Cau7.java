package buoi3;

import java.util.Scanner;

public class Cau7 {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (gcd(i, j) == 1)
                    System.out.println("(" + i + "," + j + ")");
            }
        }

    }
}
