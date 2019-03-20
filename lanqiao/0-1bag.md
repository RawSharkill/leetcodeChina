# 题目
```
某财务部门结账时发现总金额不对头。很可能是从明细上漏掉了某1笔或几笔。如果已知明细账目清单，能通过编程找到漏掉的是哪1笔或几笔吗？
如果有多种可能，则输出所有可能的情况。
我们规定：用户输入的第一行是：有错的总金额。
接下来是一个整数n，表示下面将要输入的明细账目的条数。
再接下来是n行整数，分别表示每笔账目的金额。
要求程序输出：所有可能漏掉的金额组合。每个情况1行。金额按照从小到大排列，中间用空格分开。
```
* 类似于０－１背包问题
* 注意if 语句的顺序，会影响结果的输出。 
  * `if (s>sum)`
  * `if(s==sum)`
  * `if(x==num.length())`
  * `else`  
* 选择以及递归回溯
```
re[x]=1;
s+=num[x];
right(x+1,s,sum,re,num);
 re[x]=0;
s-=num[x];
right(x+1,s,sum,re,num);
```
```
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();
        int n=scanner.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++)
            num[i]=scanner.nextInt();
        int[]re=new int[n];
        right(0,0,6,re,num);
    }
    public static void right(int x,int s,int sum,int[]re,int[]num){
        if(s>sum){
            return;
        }
        if(s==sum){
            for(int i=0;i<re.length;i++)
            {
                if(re[i]==0)
                {
                    System.out.print(num[i]+" ");
                }
            }
            System.out.println();
            return;
        }
        if(x==num.length)
            return;
        else
        {
            re[x]=1;
            s+=num[x];
            right(x+1,s,sum,re,num);
            re[x]=0;
            s-=num[x];
            right(x+1,s,sum,re,num);
        }
    }
}
```