package buoi5;

import java.util.Scanner;

public class Cau2 {
    public static int tong2(int n){
		if (n == 1) {
			return 1;
		} else {
			return (int) (Math.pow(n, 2) + tong2(n - 1));
		}
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tong2(n));
    }
}
