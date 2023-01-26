package buoi3;

import java.util.Scanner;

public class Cau1 {
    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( snt(n) == true) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
