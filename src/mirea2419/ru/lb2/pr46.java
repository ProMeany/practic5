package mirea2419.ru.lb2;

public class pr46 {
    public static int pr6(int k, int s)
    {
        s+=k%10;
        if(k/10==0) return s;
        return pr6(k/10,s);
    }
}
