package mirea2419.ru.lb2;

public class pr49 {
    public static String pr9(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return pr9(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
}
