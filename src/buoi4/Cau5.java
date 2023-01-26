package buoi4;

import java.util.Scanner;

public class Cau5 {
    public static void xetCapSo(int arr[], int sum){
        int cnt = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if ( (arr[i] + arr[j]) == sum){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        xetCapSo(arr, sum);
    }
}
