package buoi5;

import java.util.Scanner;

public class Cau21 {
    public static boolean binarySearch(int[] a, int n, int left, int right, int x){
        while (left <= right){
            int mid = (left + right)/2;
            if (a[mid] == x) {
                return true;
            } else if (a[mid] > x) return binarySearch(a, n, left, mid - 1, x);
            else return binarySearch(a, n, mid + 1, right, x);  
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt();
            if (binarySearch(a, n, 0, n - 1, x) == true) System.out.println("Yes");
            else System.out.println("NO");
            
        }
    }
}
