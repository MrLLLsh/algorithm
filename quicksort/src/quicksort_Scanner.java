import java.util.*;
/*
* 给定你一个长度为n的整数数列。
请你使用快速排序对这个数列按照从小到大进行排序。
并将排好序的数列按顺序输出。
输入格式
输入共两行，第一行包含整数 n。
第二行包含 n 个整数（所有整数均在1~109范围内），表示整个数列。
输出格式
输出共一行，包含 n 个整数，表示排好序的数列。
数据范围
1≤n≤100000
输入样例：
5
3 1 2 4 5
输出样例：
1 2 3 4 5
*/
public class quicksort_Scanner {
    public static void main(String[] args)
    {
        System.out.println("请输入要排序数的个数！");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] n = new int[num];
        System.out.println("请依次输入要排序的数字！");
        for(int i=0; i<num; i++)
        {
            n[i] = in.nextInt();
        }
        System.out.println("排序前的数字为:");
        for(int k : n)
        {
            System.out.print(k + " ");
        }
        quicksort(n,0,num-1);
        System.out.println("\n排完序的数字为:");
        for(int k : n)
        {
            System.out.print(k + " ");
        }
    }
    public static void quicksort(int[] n, int l, int r)
    {
        if(l >= r) return;
        int x = n[l];
        int i = l-1;
        int j = r+1;
        while(i < j)
        {
            do i++; while(n[i] < x);
            do j--; while(n[j] > x);
            if(i < j){
                int tmp;
                tmp = n[i];
                n[i] = n[j];
                n[j] = tmp;
            }
        }
        quicksort(n,l,j);
        quicksort(n,j+1,r);
    }
}
