package buoi4;

import java.util.Scanner;

public class Cau34 {
    public static void bubbleSort(long a[],int n){
        int buoc = 1;
        for(int i = 0;i < n - 1;i++){ 
            for(int j = 0;j < n-i-1;j++){
                if(a[j] > a[j+1]){
                    long tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            System.out.print("Buoc " + buoc + ":");
            buoc++;
            for (long x : a) {
                System.out.print(" " + x + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        bubbleSort(a, n);
    }
}
