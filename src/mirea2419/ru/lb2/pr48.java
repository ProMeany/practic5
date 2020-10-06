package mirea2419.ru.lb2;

public class pr48 {
    public static void pr8(int n, int h) {
        if (h > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % h == 0) {
            System.out.println(h);
            pr8(n / h, h);
        }
        else {
            pr8(n, ++h);
        }
    }
}
