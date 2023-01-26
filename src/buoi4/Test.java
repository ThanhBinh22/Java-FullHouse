package buoi4;

public class Test {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i <= 1000; i++) {
            if ( i % 7 != 0 && i % 11 != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
