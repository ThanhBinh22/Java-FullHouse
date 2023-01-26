package buoi6;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[][] a = new long[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; ++i){
            long sumRows = 0;
            for (int j = 0; j < m; ++j){
                sumRows += a[i][j];
            }
            System.out.print(sumRows + " ");
        }
        System.out.println("");
        for (int j = 0; j < m; ++j){
            long tongCot = 0;
            for (int i = 0; i < n; ++i){
                tongCot += a[i][j];
            }
            System.out.print(tongCot + " ");
        }
    }
}
