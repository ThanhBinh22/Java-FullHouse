package buoi5;

import java.util.Scanner;

public class Cau1 {
    public static int tong1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + tong1(n -1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tong1(n));
    }
}
