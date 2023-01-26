package baiTapTet;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int min = 1000000000; int max = -1000000000;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
                if (a[i][j] > max) max = a[i][j];
                if (a[i][j] < min) min = a[i][j];
            }
        }
        System.out.println(max);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (a[i][j] = max){
                    System.out.println((i+1) + " " + (j + 1));
                }
            }
        }
        }
}
