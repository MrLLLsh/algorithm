import java.util.*;
/*
* 输入一个长度为n的整数序列。
* 接下来再输入m个询问，每个询问输入一对l,r
* 对于每个询问，输出原序列中从第l个数到第r个数的和
*/

/*
*   前缀和公式： s[i] = s[i-1] + a[i].
*   求l到r的和方法： s[r] - s[l-1].
*/
public class prefixplus {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入数组的长度，以及询问次数！");
        int n = in.nextInt();
        int[] a = new int[n+1];
        int[] s = new int[n+1]; // 和数组
        int m = in.nextInt();
        System.out.println("依次向数组输入数字！");
        //需要初始化使s[0]=0，因此需要从i=1进行输入.
        for(int i=1; i<=n; i++)
        {
            a[i] = in.nextInt();
        }
        for(int i=1; i<=n; i++)
        {
            s[i] = s[i-1] + a[i];
        }
        while(m>0)
        {
            System.out.println("请输入要从左到右求和的下标！");
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println("区间和为： " + (s[r] - s[l-1]));
            m--;
        }
    }
}
