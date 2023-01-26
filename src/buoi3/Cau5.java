package buoi3;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int L = (int) Math.sqrt(a);
        int R = (int) Math.sqrt(b);
        if (1l * L * L != a)
            L = L + 1;
            int count = 0;
        for (int i = L; i <= R; i++) {
            count++;
        }
        System.out.println(count);
    }
}
