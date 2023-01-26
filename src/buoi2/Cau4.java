package buoi2;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result++;
                if (n / i != 1) {
                    result++;
                }
            }
        }
        System.out.println(result);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
