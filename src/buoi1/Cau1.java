package buoi1;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.print(a / b + " ");
        System.out.print(a % b);
    }
}
