package test;

import java.util.Scanner;

public class TongUocCuaSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i ++){
            if (n % i == 0){
                sum+=i;
                if (i != n/i){
                    sum+= n/i;
                }
            }
        }
        System.out.println(sum);
    }
}
