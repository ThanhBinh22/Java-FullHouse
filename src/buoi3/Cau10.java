package buoi3;

import java.util.Scanner;

public class Cau10 {
   public static boolean ptPrime(long n) {
      int cnt = 0;
      for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              int mu = 0;
              while (n % i == 0) {
                  mu++;
                  n /= i;
              }
              if (mu >= 2) return false;
              else cnt++;
          }
      }
      if (n != 1) cnt ++;
          if (cnt == 3) return true;
          else return false;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      if (ptPrime(n) == true) System.out.println("YES");
      else System.out.println("NO");
   }
}
