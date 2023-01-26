package buoi4;

import java.util.Scanner;

public class Cau27 {
    public static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubbleSort(a, n);
        bubbleSort(a,n);
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
