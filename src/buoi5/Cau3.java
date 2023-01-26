package buoi5;

import java.util.Scanner;

public class Cau3 {
    public static long tong3(int n){
		if (n == 1) {
			return 1;
		} else {
			return (long) (Math.pow(n, 3) + tong3(n - 1));
		}
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tong3(n));
    }
}
