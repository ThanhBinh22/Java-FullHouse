package buoi4;

import java.util.Scanner;

public class Cau37 {
    public static boolean binarySeach(int[] a, int n){
       for (int i = 0; i < n; i++){
        int max = i;
        for (int j = i + 1; j < n; j++){
            if (a[i] < a[j]) {
                max = j;
            }
        }
        int tmp = a[max];
       a[max] = a[i];
       a[max] = tmp;
       }
       
    }       
}
