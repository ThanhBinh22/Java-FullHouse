package buoi6;

import java.util.Scanner;

public class Cau5 {
    public static boolean stn(int n) {
        int num = 0, m = n;
        while (n != 0) {
            num = num * 10 + n % 10;
            n /= 10;
        }
        if (num == m)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (stn(a[i][j]) == true){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
