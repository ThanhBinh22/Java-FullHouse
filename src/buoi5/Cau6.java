package buoi5;

import java.util.Scanner;

public class Cau6 {
    public static long fibonaci(int n){
        if ( n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonaci(n));
    }
}
