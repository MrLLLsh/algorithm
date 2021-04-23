//题目：
//    某学校的期末考试共有n个学生参加，考试科目共有m科。学校将会给一部分学生颁发单科成绩优秀奖，获奖学生需要满足的条件是某一科的成绩是所有学生中最高的或是最高的之一。请问学校应该给多少名学生颁发单科成绩优秀奖。
//
//输入：
//    输入第一行包含两个正整数n和m，分别代表学生人数和考试科目数量。(n,m<=500)
//    接下来有n行，每行有m个正整数，每个正整数在1-100之间，中间用空格隔开，表示每个学生的m科考试成绩。
//
//输出：
//    输出仅包含一个整数，表示获得单科成绩优秀奖的人数
//
//输入：
//5 5
//28 35 38 10 19
//4 76 72 38 86
//96 80 81 17 10
//70 64 86 85 10
//1 93 19 34 41
//
//输出：4

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//人数
        int m = in.nextInt();//科目
        int [][] a = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = in.nextInt();
            }
        }
        boolean[] b = new boolean[n];//记录血汗恶搞是否为最好的
        for(int j=0; j<m; j++){
            int best = 0;
            for(int i=0; i<n; i++){
                if(a[i][j] > best){
                    best = a[i][j];
                }
            }
            for(int i=0; i<n; i++){
                if(a[i][j] == best){
                    b[i] = true;
                }
            }
        }
        int num = 0;
        for(int i=0; i<n; i++){
            if(b[i] == true){
                num++;
            }
        }
        System.out.println(num);
    }

}
