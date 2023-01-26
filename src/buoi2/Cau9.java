package buoi2;

import java.util.Scanner;

public class Cau9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int chan = 0;
        int le = 0;
        while (n != 0) {
            long x = n % 10;
            if (x % 2 == 0) {
                chan += x;
            } else {
                le += x;
            }
            n /= 10;
        }
        System.out.println(chan + " " + le);
    }
}
