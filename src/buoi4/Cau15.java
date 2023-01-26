package buoi4;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Cau15 {
    public static int count[] = new int[1000001];
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
    count[a[i]]++;
    }
    for (int i = 0; i < 1000000; i++){
    if(count[i] != 0){
    System.out.println(i + " " + count[i]);
    }
    }
    System.out.println("");
    for (int i = 0; i < n; i++){
    if (count[a[i]] != 0) {
    System.out.println(a[i] + " " + count[a[i]]);
    count[a[i]] = 0;
    }
    }
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // Map<Long, Integer> map = new TreeMap<>();
    // int n = sc.nextInt();
    // Long a[] = new Long[n];
    // for (int i = 0; i < n; i++) {
    // a[i] = sc.nextLong();
    // }
    // for (int i = 0; i < n; i++){
    // if ( map.containsKey(a[i]) == true){
    // int tanSuat = map.get(a[i]);
    // tanSuat++;
    // map.put(a[i], 1);
    // }
    // }
    // Set<Map.Entry<Long, Integer>> set = map.entrySet();
    // for (Map.Entry<Long, Integer> x : set) {
    // System.out.println(x.getKey() + " " + x.getValue());
    // }
    // System.out.println("");
    // for (int i = 0; i < n; i++) {
    // if (map.get(a[i]) != 0) {
    // System.out.println(a[i] + " " + map.get(a[i]));
    // map.put(a[i], 0);
    // }
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Long, Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        Long a[] = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++){
            if ( map.containsKey(a[i]) == true){
                        int tanSuat = map.get(a[i]);
                        tanSuat++;
                        map.put(a[i], 1);
                    }
        Set<Map.Entry<Long, Integer>> set = map.entrySet();
        for (Map.Entry<Long, Integer> x : set) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) != 0) {
                System.out.println(a[i] + " " + map.get(a[i]));
                map.put(a[i], 0);
            }
        }
    }
}
