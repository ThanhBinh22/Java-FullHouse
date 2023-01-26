package buoi4;

import java.util.Scanner;

public class cau6 {
    public static int gcd(int a, int b) { // giai thuat euclid
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i =0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int x  = 0;
        for (int i = 0; i < n; i++){
            x = gcd(x, a[i]);
        }
        System.out.println(x);
    }

}
