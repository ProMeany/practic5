package mirea2419.ru.lb2;

public class Main {
    public static int pr(int k, int s, int k1, int k2, int h)
    {
         int g=k1;
         int sum=0;
         while(g>0)
         {
             sum+=g%10;
             g=g/10;
         }
         if(sum==s) h+=1;
         if(k1==k2) return h;
         return pr(k,s,k1+1,k2,h);
    }
    public static void main(String[] args) {
        //задание 4
        int k = 3, s = 10, k1, k2;
        int h=0;
        String l = "";
        for (int i = 0; i < k; i++) {
            l += "9";
        }
        k2 = Integer.parseInt(l);
        l = "1";
        for (int i = 0; i < k-1; i++) {
            l += "0";
        }
        k1 = Integer.parseInt(l);
        System.out.println(pr(k,s,k1,k2,h));


//задание 5
        int n=54544;
        System.out.println(pr45.pr5(n,0));

//задание 6
        System.out.println(pr47.pr7(17, 2));
//задание 7 Множетели повторяются, потому что сложность должна быть log(n), лишние операции увеличат сложность
        pr48.pr8(18,2);
//задание 8
        System.out.println(pr49.pr9("topot"));
        System.out.println(pr49.pr9("topor"));
    }
}

