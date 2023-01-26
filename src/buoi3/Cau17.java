package buoi3;

import java.util.Scanner;

public class Cau17 {
    public static boolean stn(int n) {
        int k = 0, m = n;
        while (n != 0) {
            k = k * 10 + n % 10;
            n /= k;
        }
        if (k == m)
            return true;
        return false;
    }

    public static boolean check6(int n) {
        while (n != 0) {
            if (n % 10 == 6)
                return true;
            n /= 10;
        }
        return false;
    }

    public static boolean check8(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum % 10 == 8)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ok =0;
        for (int i = a; i <= b; i++) {
            if (stn(i) == true && check6(i) == true && check8(i) == true){
                System.out.print(i + " ");
                ok = 1;
            }
        }
        if (ok == 0) System.out.println("-1");
    }
}
