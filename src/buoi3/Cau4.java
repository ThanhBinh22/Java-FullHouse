package buoi3;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int L = (int) Math.sqrt(a);
        int R = (int) Math.sqrt(b);
        if (1l*L*L != a) L = L+1;
        for (int i = L; i <= R; i++){
            System.out.print(1l*i*i + " ");
        }
    }
}
