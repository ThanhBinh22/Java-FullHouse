package buoi2;

import java.util.Scanner;

public class cau10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int result = 0;
        while (n != 0){
            if ( n % 10 == 2 || n % 10 == 3 || n % 10 == 5 || n % 10 == 7) result++;
            n /= 10;
        }
        System.out.println(result);
    }
}
