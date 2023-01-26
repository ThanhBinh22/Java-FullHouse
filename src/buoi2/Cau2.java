package buoi2;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        for ( int i = 1; i <= n; i++){
            result += (long) Math.pow(i, 2);
        }
        System.out.println(result);
    }
}
