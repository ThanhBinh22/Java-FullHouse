package buoi4;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Cau17 {
    public static boolean prime(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++){
            a[n] = sc.nextLong();
        }
        Map<Long,Integer> map = new TreeMap<>();
        for (int i  = 0; i < n; i++){
            if (prime(a[i]) == true) {
            if ( map.containsKey(a[i]) == true){
                Integer tanSuat = map.get(a[i]);
                tanSuat++;
                map.put(a[i], 1);
            }
            else {
                map.put(a[i], 0);
            }
        }}
        Set<Map.Entry<Long, Integer>> set = map.entrySet();
        for (Map.Entry<Long, Integer> x : set) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
 // public static int cnt[] = new int[100000];

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] a = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         a[i] = sc.nextInt();
    //         cnt[a[i]]++;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         if (prime(a[i])) {
    //             if (cnt[(a[i])] != 0) {
    //                 System.out.println(a[i] + " " + cnt[a[i]]);
    //                 cnt[a[i]] = 0;
    //             }
    //         }
    //     }
    // }