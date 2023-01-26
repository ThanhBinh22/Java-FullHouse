package buoi1;

import java.util.Scanner;

public class Cau23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nam = n/365;
        int tuan = (n%365)/7;
        int ngay = tuan%7;
        System.out.print(nam + " " + tuan + " " + ngay); 
    }
}
