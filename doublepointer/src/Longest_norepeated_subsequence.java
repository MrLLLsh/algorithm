import java.util.*;
/*
*   给定一个长度为n的整数序列，请找出最长的不包含重复数字的连续子序列，输出它的长度。
*   如 1 2 2 3 5 , 答案是3
*/
public class Longest_norepeated_subsequence {
    public static char[] n = new char[1000];
    public static char[] s = new char[1000000];
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串！");
        String str = in.nextLine();
        int num = str.length();
        for(int i=0; i<num; i++)
        {
            n[i] = str.charAt(i);
        }
        int max = 0;
        for(int i=0, j=0; i<num; i++)
        {
            s[n[i]] ++;
            while(s[n[i]] > 1)
            {
                s[n[j]]--;
                j++;
            }
            //也可以用哈希表来判重.
            max = Math.max(max, i-j+1);
        }
        System.out.println("长度为：" + max);
    }
}
