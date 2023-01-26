package buoi5;

import java.util.Scanner;

public class Cau16 {
    public static void tachSoThuan(long n){
        if (n < 10) {
            System.out.print(n + " ");
            return;
        } else {
            tachSoThuan(n/10);
            System.out.print(n % 10 + " ");
        }
    }
    public static void tachSoNguoc(long n) {
        if (n == 0) { 
            System.out.println();
        } else {
            System.out.print(n % 10 + " ");
            tachSoNguoc(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tachSoThuan(n);
        System.out.println();
        tachSoNguoc(n);
    }
}
