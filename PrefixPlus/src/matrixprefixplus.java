import java.util.*;

public class matrixprefixplus {
    static int N = 1010;
    static int[][] a = new int[N][N];
    static int[][] s = new int[N][N];
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("请依次输入矩阵的长和宽，以及询问次数！");
        int m = in.nextInt();
        int n = in.nextInt();
        int t = in.nextInt();
        System.out.println("请从上到下，从左到右依次输入矩阵中数字！");
        for(int i=1; i<=m; i++ )
            for(int j=1; j<=n; j++)
                a[i][j] = in.nextInt();
        for(int i=1; i<=m; i++)
            for(int j=1; j<=n; j++)
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + a[i][j]; //求前缀和.
        System.out.println("矩阵为：");
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        while(t>0)
        {
            int x1,y1,x2,y2;
            System.out.println("依次输入x1,y1,x2,y2的值");
            x1= in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            System.out.println("子矩阵和为：" + (s[x2][y2] - s[x2][y1-1] - s[x1-1][y2] + s[x1-1][y1-1])); //求子矩阵面积和
            t--;
        }
    }
}
