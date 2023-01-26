package buoi3;

import java.util.Scanner;

public class Cau3 {
    public static boolean scp(int n) {
        int can = (int) Math.sqrt(n);
        if (1l * can * can == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (scp(n) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
