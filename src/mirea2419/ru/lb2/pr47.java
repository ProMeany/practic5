package mirea2419.ru.lb2;

public class pr47 {
    public static boolean pr7(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return pr7(n, i + 1);
        } else {
            return true;
        }
    }
}
