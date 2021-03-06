import java.util.*;
import java.lang.*;

public class intervalsmerge {
    private static int N = 100010;
    private static int[] a;
    private static ArrayList<int[]> list = new ArrayList();
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入区间的个数！");
        int n = in.nextInt();
        for(int i=0; i<n; i++)
        {
            a = new int[2];
            System.out.printf("请输入第%d区间的第一位：\n", i+1);
            a[0] = in.nextInt();
            System.out.printf("请输入第%d区间的第二位：\n", i+1);
            a[1] = in.nextInt();
            list.add(a);
        }
        int num = merge(list);
        System.out.println("合并后的区间个数为：" + num);
    }
    public static int merge(ArrayList<int[]> list)
    {
        ArrayList<int[]> res = new ArrayList<>();
        /*
        * 集合升序排序
          Collections.sort(student, new Comparator(){
            public int compare(StudentVo p1, StudentVo p2) {
                return Integer.parseInt(p1.getStudentCode()) - Integer.parseInt(p2.getStudentCode());
            }
          });
        *
        */
        //对列表中每个数组的0位置元素进行升序排序
        list.sort(new Comparator<int[]>()
        {
            @Override
            public int compare(int[] o1, int[] o2)
            {
                return o1[0] - o2[0];
            }
        });
        int l = Integer.MIN_VALUE;
        int r = Integer.MIN_VALUE;
        for(int[] a : list)
        {
            if(a[0] > r)
            {
                if(l != Integer.MIN_VALUE)
                    res.add(new int[]{l,r});
                l = a[0];
                r = a[1];
            }
            else
            {
                r = Math.max(r, a[1]);
            }
        }
        if(l != Integer.MIN_VALUE)
            res.add(new int[]{l,r});
        return res.size();
    }

}


