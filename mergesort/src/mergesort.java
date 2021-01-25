import java.util.*;

public class mergesort {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数的个数！");
        int num = in.nextInt();
        int[] n =new int[num];
        System.out.println("请依次输入要排序的数字！");
        for(int i=0; i<num; i++)
        {
            n[i] = in.nextInt();
        }
        merge_sort(n,0,num-1);
        System.out.println("排序后的数组为：");
        for(int k : n)
        {
            System.out.print(k + " ");
        }
    }
    public static void merge_sort(int[] n, int l, int r)
    {
        if(l >= r) return;
        int num = r-l+1;
        int mid = l + r >> 1;
        merge_sort(n,l,mid);
        merge_sort(n,mid+1,r);
        int[] tmp = new int[num];
        int k = 0;
        int i = l, j = mid+1;
        while(i<=mid && j<=r)
        {
            if(n[i] <= n[j]) tmp[k++] = n[i++];
            else tmp[k++] = n[j++];
        }
        while(i <= mid) tmp[k++] = n[i++];
        while(j <= r) tmp[k++] = n[j++];
        for(i=l, j=0; i<=r; i++, j++)
        {
            n[i] = tmp[j];
        }
    }
}
