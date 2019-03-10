/*
　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
输入格式
　　输入一行，包含一个正整数n。
输出格式
　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
样例输入
52
样例输出
899998
989989
998899
数据规模和约定
　　1<=n<=54。

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        if(x%2!=0) {
            for (int i = 10000; i <= 99999; i++) {
                int b = i % 100000 / 10000;
                int c = i % 10000 / 1000;
                int d = i % 1000 / 100;
                int e = i % 100 / 10;
                int f = i % 10;
                if (b == f && c == e && (b + c + d + e + f == x)) {
                    System.out.println(i);
                }
            }
        }
        else {
            for (int i = 100000; i < 999999; i++) {
                int a = i % 1000000 / 100000;
                int b = i % 100000 / 10000;
                int c = i % 10000 / 1000;
                int d = i % 1000 / 100;
                int e = i % 100 / 10;
                int f = i % 10;
                if (a == f && b == e && c == d && (a + b + c + d + e + f == x)) {
                    System.out.println(i);
                }
            }
        }
    }

}