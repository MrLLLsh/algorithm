import java.util.*;

public class halfsearch {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数的个数！");
        int num = in.nextInt();
        int[] n = new int[num];
        System.out.println("请依次输入数字，注意应为升序排序！");
        for(int i=0; i<num; i++)
        {
            n[i] = in.nextInt();
        }
        halfsearch(n,0,num-1);
    }
    public static void halfsearch(int[] n, int l, int r)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入想查找的值！");
        int tar = in.nextInt();
        while(l < r)
        {
            /*
            * 整数型二分查找存在边界问题，如果在判断是否满足条件之后，更新为l = mid时，
            * 需要早取mid时为mid = l + r + 1 >> 1
            * 因为如果当r = l + 1时，（整数型向下取整）得出mid = l，在更新后l = l，这样与更新前没有任何变化，会陷入死循环，
            * 因此需要取mid  = l + r + 1 >> 1
            */
            int mid = l + r >> 1;
            if(n[mid] >= tar) r = mid;
            else l = mid+1;
        }
        if(n[l] != tar) System.out.println("目标值不存在！");
        System.out.println("目标值的下标为：" + l);
    }
}
