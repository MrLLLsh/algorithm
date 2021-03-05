import java.util.*;
//给定一个长度为n的数列，求每一个数的二进制表示中"1"的个数
public class lowbit {
    public static int Lowbit(int x)
    {
        return x & -x ;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入要检查的个数：");
        int n = in.nextInt();
        while(n>0)
        {
            int x;
            System.out.println("输入要检查的数：");
            x = in.nextInt();
            int res=0;
            while(x>0)
            {
                x-=Lowbit(x);
                res++;
            }
            System.out.println("1的个数为：" + res);
            n--;
        }
    }
}
