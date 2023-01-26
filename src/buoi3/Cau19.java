package buoi3;

import java.util.Scanner;

public class Cau19 {
    public static int ptPrime(int n, int k) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if ( n % i == 0){
                while(n % i ==0){
                    cnt++;
                    if (cnt == k) return i;
                    n /= i;
                }
            }
        }
        if (n != 1){
            cnt++;
        if (cnt == k) return n;
    }
    return -1;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(ptPrime(n, k));
    }
}
