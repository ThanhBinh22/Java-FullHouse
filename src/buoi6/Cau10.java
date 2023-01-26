package buoi6;

import java.util.Arrays;
import java.util.Scanner;

public class Cau10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int [][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < n; i++){
           Arrays.sort(b[i]);
        }
        for (int j = 0; j < n; j++){
            for (int i = 0; i < n; i++){
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
