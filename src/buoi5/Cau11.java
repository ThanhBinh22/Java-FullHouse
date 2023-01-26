package buoi5;

import java.util.Scanner;

public class Cau11 {
    public static void binary(long n) {
        if (n == 0) {
            return;
        } else {
            binary(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        binary(n);
    }
}
