package buoi6;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int minNum = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] < minNum) {
                    minNum = a[i][j];
                }
            }
        }
        System.out.println(minNum);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == minNum) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }

        int maxNum = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > maxNum) {
                    maxNum = a[i][j];
                }
            }
        }
        System.out.println(maxNum);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == maxNum) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // int a[][] = new int[n][m], min = (int)1e9+10, max = (int)-1e9-10;
    // for(int i = 0;i < n;i++){
    // for(int j = 0;j < m;j++){
    // a[i][j] = sc.nextInt();
    // if(a[i][j] < min) min = a[i][j];
    // if(a[i][j] > max) max = a[i][j];
    // }
    // }
    // System.out.println(min);
    // for(int i = 0;i < n;i++){
    // for(int j = 0;j < m;j++){
    // if(a[i][j] == min){
    // System.out.println((i+1) + " " + (j+1));
    // }
    // }
    // }
    // System.out.println(max);
    // for(int i = 0;i < n;i++){
    // for(int j = 0;j < m;j++){
    // if(a[i][j] == max){
    // System.out.println((i+1) + " " + (j+1));
    // }
    // }
    // }
    // }
}
