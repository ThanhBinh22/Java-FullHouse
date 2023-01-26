package buoi3;

import java.util.Scanner;

public class Cau6 {
    public static boolean prime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        while (time-- > 0) {
            int n = sc.nextInt();
            for (int i = 2; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (prime(i) == true && prime(j) == true && i + j == n) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
