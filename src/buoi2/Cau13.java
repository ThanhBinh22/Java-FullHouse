package buoi2;

import java.util.Scanner;

public class Cau13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int p = sc.nextInt();
        long dem = 0;
        for (long k = p; k <= n; k *= p){
            dem += n/k;
        }
        System.out.println(dem);
    }
}
