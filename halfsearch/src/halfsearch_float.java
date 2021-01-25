import java.util.*;
import java.lang.String;
//因为浮点数不像整数一样存在边界问题，因此会简单很多.
//本题为给定一个浮点数n,求它的三次方根,注意,结果保留6位小数.
public class halfsearch_float {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入想要查询三次方根的数！");
        double n = in.nextDouble();
        double l = -1000, r = 1000;
        while(r - l > 1e-8) //为了更加精确，一般多校准精度的-2次幂
        {
            double mid = (l + r)/2;
            if(mid*mid*mid >= n) r = mid;
            else l = mid;
        }
        System.out.println("三次方根为" + String.format("%.6f", l)); //String.format() 字符串常规类型格式化
    }
}
