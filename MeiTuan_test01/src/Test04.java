import java.util.ArrayList;
import java.util.Scanner;

//题目描述：
//    n个数的伪中位数定义为从小到大排序后第⌊(n+1)/2⌋个数。其中，⌊x⌋的意思是x向下取整。
//    现在，给你n个数，你需要向其中增加最少的数，使得k成为最后这一组数的伪中位数。
//    请问你需要加入数的最少数。
//
//输入
//    输入第一行包含两个数n,k,意为原来数的个数和最后的伪中位数。
//    接下来一行n个数a_i，空格隔开，代表原来的数。
//    1≤n≤500,1≤a_i≤100000
//
//输出
//    输出一个数，你需要加入数的最少数量。
//
//样例输入
//    4 2
//    2 3 3 3
//    5 2
//    2 3 4 4 5
//样例输出
//    2
//
//提示
//    样例解释：加入1,1后,原数组变为1,1,2,3,3,3,其伪中位数为2。
public class Test04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int res = 0;
        int min = 0;
        int max = 0;
        int same = 0;
        boolean flag = false;
        for(int i=0; i<n; i++)
        {
            int tmp = in.nextInt();
            if(tmp < k)
                min++;
            else if(tmp > k)
                max++;
            else if(tmp == k){
                if(flag)
                    same++;
                else
                    flag = true;
                    same++;
                    res++;
            }
        }
        if(max > min){
            int dif = max - min;
            dif = dif > same ? dif - same - 1 : 0;//因为是向向下取整
            res += dif;
        }
        else if(max < min){
            int dif = min - max;
            dif = dif > same ? dif - same : 0;
            res += dif;
        }
        System.out.println(res);
    }
}
