package buoi3;

import java.util.Scanner;

public class Cau12 {
    // cách 1
    // public static void main(String[] args) {
    //     long uocSNT = 0;
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     for ( int i = 0; i < t; i++){
    //         long n = sc.nextLong();
    //         for(int j = 2; j <= Math.sqrt(n); j++){
    //             while(n%j == 0 && n != j){
    //                 n = n/j;
    //             }
    //             uocSNT = n;
    //         }
    //         System.out.println(uocSNT);
    //     }
    // }

    // cách 2
    public static int pt(int n){
        int max =0;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                while (n % i == 0){
                    n /=i;
                }
                if (i > max) max = i;
            }
        }
        if (n != 1) max = n;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int x = sc.nextInt();
            System.out.println(pt(x));
        }
    }
}
