package buoi1;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long S = 1l*a*(b+c)+1l*b*(a+c);
        System.out.println(S);
    }
}
