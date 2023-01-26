package test;

import java.util.Scanner;

public class TongUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if ( n % i == 0){
                count++;
                if ( i != n/i){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
