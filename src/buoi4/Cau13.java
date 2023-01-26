package buoi4;

import java.util.Scanner;

public class Cau13 {
    // public static boolean snt(int n) {
    //     if (n < 2) {
    //         return false;
    //     }
    //     for (int i = 2; i <= n; i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static long gcd(long a, long b){
        while (b != 0){
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int cnt =0;
        for (int i = 0; i < n; i++){
            for (int j = i +1; j < n; j++){
                if (gcd(a[i], a[j]) == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
