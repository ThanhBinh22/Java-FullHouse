package buoi2;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        for(int i = 0; i <= n; i++ ){
            result += i;
        } 
        System.out.println(result);
    }
}
