import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] n = new int[num];
        for(int i=0; i<num; i++)
        {
            n[i] = in.nextInt();
        }
        heapsort(n);
        for(int k : n)
        {
            System.out.print(k + " ");
        }
    }
    public static void heapsort(int[] arr)
    {
        heapinit(arr);
        int size = arr.length;
        while(size > 1)
        {
            swap(arr, 0 , size - 1);
            size--;
            rheap(arr, 0, size);
        }
    }
    public static void heapinit(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int cur_index = i;
            int father_index = (i - 1) / 2;
            while(arr[cur_index] > arr[father_index])
            {
                swap(arr, cur_index, father_index);
                cur_index = father_index;
                father_index = (cur_index - 1) / 2;
            }
        }
    }
    public static void rheap(int[] arr, int index, int size)
    {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        while(left < size){
            int maxIndex;
            if(arr[left] < arr[right] && right < size){
                maxIndex = right;
            }
            else{
                maxIndex = left;
            }
            if(arr[index] > arr[maxIndex]){
                maxIndex = index;
            }
            if(arr[index] == arr[maxIndex]){
                return;
            }
            swap(arr, index, maxIndex);
            index = maxIndex;
            left = index * 2 + 1;
            right = index * 2 + 2;
        }

    }
    public static void swap(int[] arr, int cur_index, int father_index)
    {
        int tmp;
        tmp = arr[cur_index];
        arr[cur_index] = arr[father_index];
        arr[father_index] = tmp;
    }
}
