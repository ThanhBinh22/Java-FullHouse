package buoi4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Cau36 {
    public static int tong(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 2 == 0) < (o2 % 2 != 0)) {
                  if (o1 < o2){
                    return -1;
                  } else { 
                    return 1;
                }
                } else {

                }
            }
        });
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0 && o2 % 2 != 0) {
                    if (o1 < o2) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (o1 % 2 == 0 && o2 % 2 == 0) {
                    if (o1 > o2) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    if (o1 < o2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });
        for (int x: a){
            System.out.print(x + " ");
        }
    }
}
