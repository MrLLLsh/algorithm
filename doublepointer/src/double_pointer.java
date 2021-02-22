import java.util.*;
import java.lang.*;

/*
* 输入一个字符串，该字符串包含许多单词。打印出所有的单词并使每一个各占一行。
*/
public class double_pointer {
    public static char[] str = new char[1000];
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串！");
        String s = in.nextLine();
        int n = s.length();
        for(int i=0; i<n; i++)
        {
            str[i] = s.charAt(i);
        }
        System.out.print("输入的字符串为：");
        for(char k : str)
        {
            System.out.print(k);
        }
        System.out.println();
        System.out.println("输出结果为：");
        for(int i=0; i<n; i++)
        {
            int j = i;
            while(j < n && str[j] != ' ')
            {
                System.out.print(str[j]);
                j++;
            }
            System.out.println();
            i = j;
        }
    }
}
