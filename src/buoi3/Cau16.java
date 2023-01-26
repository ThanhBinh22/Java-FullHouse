package buoi3;

import java.util.Scanner;

public class Cau16 {
    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int n) {
        int cuoi = n % 10;
        n /= 10;
        while (n != 10) {
            if (cuoi < n % 10)
                return false;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (snt(i) == true && check(i) == true) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println("");
        System.out.println(cnt);
    }
}
