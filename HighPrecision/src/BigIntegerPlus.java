import java.util.*;
import java.lang.String;

public class BigIntegerPlus {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("这里是高精度大数相加！");
        System.out.println("请输入第一个大数字：");
        String s1 = in.nextLine();
        System.out.println("请输入第二个大数字：");
        String s2 = in.nextLine();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=s1.length()-1; i>=0; i--)
        {
            list1.add(s1.charAt(i) - '0');
        }
        for(int j=s2.length()-1; j>=0; j--)
        {
            list2.add(s2.charAt(j) - '0');
        }
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3 = add(list1, list2);
        System.out.println("结果是：");
        for(int i=list3.size()-1; i>=0; i--)
        {
            System.out.print(list3.get(i));
        }
    }
    public static ArrayList<Integer> add (ArrayList<Integer> l1, ArrayList<Integer> l2)
    {
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        int t = 0;// 进位
        for(int i=0; i<l1.size() || i<l2.size(); i++)
        {
            if(i < l1.size()) t += l1.get(i);
            if(i < l2.size()) t += l2.get(i);
            l3.add(t % 10);
            t /= 10;
        }
        if(t != 0) l3.add(t);
        return l3;
    }
}
