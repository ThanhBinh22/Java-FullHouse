package buoi5;

import java.util.Scanner;

public class Cau14 {
    public static long tong(long n) {     
        if (n == 0) {
            return 0;
        } else {
            return 1 + tong(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(tong(n));
    }
}
