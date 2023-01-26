package buoi2;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

                result *= i;
            }
        }
        System.out.println(result);
    }
}
