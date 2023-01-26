package buoi5;

import java.util.Scanner;

public class Cau4 {
    public static int tong4(int n){
        if (n == 1) {
            return -1;
        } else {
            return (int) Math.pow(-1, n) *n + tong4(n -1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tong4(n));
    }
}
