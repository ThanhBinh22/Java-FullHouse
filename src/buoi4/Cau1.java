package buoi4;

import java.util.Scanner;

public class Cau1 {
    public static boolean snt(int n) {
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
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (snt(a[i]) == true)
                count++;
        }
        if (count != 0)
            System.out.println(count);
        else
            System.out.println("NONE");
    }
}
