package buoi3;

import java.util.Scanner;

public class Cau21 {
    public static boolean snt(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if(snt(i) == true) System.out.print(1l*i*i + " ");
        }
    }
}
