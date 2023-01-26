package buoi2;

import java.util.Scanner;

public class Cau12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int dem = 0;
        for (int k = 5; k <= n; k*= 5){
            dem += n/k;
        }
        System.out.println(dem);
    }
}
