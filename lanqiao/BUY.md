# 题目
```
公司发了某商店的购物券1000元，限定只能购买店中的m种商品。每种商品的价格分别为m1,m2,…，要求程序列出所有的正好能消费完该购物券的不同购物方法。

程序输入：
第一行是一个整数m，代表可购买的商品的种类数。
接下来是m个整数，每个1行，分别代表这m种商品的单价(0<m<1000)。
程序输出：
    第一行是一个整数，表示共有多少种方案
    第二行开始，每种方案占1行，表示对每种商品购买的数量，中间用空格分隔。
 ```
* 类似背包问题
* 设置各种变量为全局变量，方便访问，并且要将数组在main函数中new
* 题目思路：用buy()函数进行递归调用

```
import sun.dc.pr.PRError;

import java.math.BigInteger;
import java.util.*;

public class Main {
   static int m;//商品数目
    static int[]prize;
    static int as;//方案数目
    static int[][]p;//方案具体记录
    static int[]k;//记＝记录中间数据
    static int money;
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       m=scanner.nextInt();
        prize=new int[m];
        for(int i=0;i<m;i++){
            prize[i]=scanner.nextInt();
        }
        p=new int[100][m];
        k=new int[m];
        buy(0);
        System.out.println(as);
        for(int i=0;i<as;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(p[i][j]+" ");
            System.out.println();
        }
    }
    public static void buy(int n){
        if(n>=m || money>1000)
            return;
        if(money==1000){
            for(int i=0;i<m;i++)
            {
                p[as][i]=k[i];
            }
            as++;
            return;
        }
        else{
            k[n]++;
            money+=prize[n];
            buy(n);
            k[n]--;
            money-=prize[n];
            buy(n+1);
        }
    }
}
```