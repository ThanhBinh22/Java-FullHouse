package test;

import java.util.Scanner;

public class Check2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();

            if (x == 2022) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
