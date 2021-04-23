import java.util.*;
//n的二进制表示中第k位是几？
public class BitArithmetic {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个数：");
        int n = in.nextInt();
        System.out.println("它的二进制表示为");
        for(int k=3; k>=0; k--)
        {
            System.out.print(n >> k & 1);
        }
    }
}
