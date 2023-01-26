package buoi2;

import java.util.Scanner;

public class Cau11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int k = 1; k <= n; k++){
            System.out.println(1l*k*k*(k*k-1)/2 - 4*(k-1)*(k-2));
        }
    }
}
