package test;

import java.util.Scanner;

public class TichUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long product = 1;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                product*=i;
                if (i != n/i){
                    product*=n/i;
                }
            }
        }
        System.out.println(product);
    }
}
