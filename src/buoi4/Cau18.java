package buoi4;

import java.util.Scanner;
import java.util.TreeSet;

public class Cau18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set1.add(a[i]);
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
            set2.add(b[j]);
        }
        TreeSet<Integer> giao = new TreeSet<>();
        giao.addAll(set1);
        giao.retainAll(set2);
        for (int x : giao) {
            System.out.print(x + " ");
        }
        System.out.println("");
        TreeSet<Integer> hop = new TreeSet<>();
        hop.addAll(set1);
        hop.addAll(set2);
        for (int x : hop) {
            System.out.print(x + " ");
        }
    }
}
