import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//题目描述：
//     现在有两个串S和T，你需要从S中取出一个子串，并且从T中取出一个子序列，使得两个取出来的串一样。这样不同的方案有多少？答案对10^9+7取模。子串的意思是在字符串中截取连续一段，比如bc是abcd的子串。
//子序列的意思是在字符串中截取不一定连续的几段（也可以是一段）连在一起，比如ac是abcd的子序列。
//     注意，在本题中，两种取法位置不同，但是取出来的字符串是相同的情况算作两种不同的情况，详见样例解释。
//
// 输入
//     输入包含两个字符串S,T  一行一个字符串
//    |S|,|T|≤5000
//输出
//     输出包含一个数，代表答案对10^9+7取模。
//
//样例输入
//aaa       abcd   a b c d ab ac ad bc bd cd abc abd acd abcd n+ a b c d ab bc cd abc bcd abcd abcde  a b c d e ab bc cd de abc bcd cde abcd bcde ancde
//aaa
//
//样例输出
//    16
//
//提示
//样例解释
//    S有6个子串，T有7个子序列。
//    S的6个子串：a(1),a(2),a(3),aa(12),aa(23),aaa(123);
//    T的7个子序列：a(1),a(2),a(3),aa(12),aa(23),aa(13),aaa(123);
//    可以得知，如果这个相同的串为a，有3×3种取法，如果这个相同的串为aa，有2×3种取法，如果这个相同的串为aaa，有1×1种取法。
//    总共有16种取法。
public class Test05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        String[] arr1 = new String[n1];
        String[] arr2 = new String[n2];
        for(int i=0; i<n1; i++)
        {
            arr1[i] = String.valueOf(str1.charAt(i));
        }
        int sum1 = 0;
        for(int i=1; i<=n1; i++)
        {
            sum1 += i;
        }



    }




}
