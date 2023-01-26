package buoi2;

import java.util.Scanner;


public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int co2022 = 0;
        for ( int i = 1; i <= n; i++){
            int x = sc.nextInt();
            if ( x == 2022)
             co2022 = 1;
        }
        if ( co2022 == 0){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
