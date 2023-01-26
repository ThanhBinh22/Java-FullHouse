package buoi3;

import java.util.Scanner;

public class Cau11 {
    static int tong(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int tongSNT(int n) {
        int i = 2, sum = 0;
        while (n > 1) {
            if (n % i == 0) {
                sum += tong(i);
                n = n / i;
            } else {
                do {
                    i++;
                } while (!snt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (tong(n) == tongSNT(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
