package mirea2419.ru.lb2;

public class pr45 {
    public static int pr5(int k, int s)
    {
        s+=k%10;
        if(k/10==0) return s;
        return pr5(k/10,s);
    }
}
