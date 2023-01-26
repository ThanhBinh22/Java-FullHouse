package buoi2;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int result = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                result += n/i;
                result += i;
            } 
            if (n/i == i){
                result += n/i;
                result -= i;             
            }
        }
        System.out.println(result);
    }
}
