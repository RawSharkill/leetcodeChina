# 题目
```
汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。
大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上(可以借助第三根柱子做缓冲)。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
如图【1.jpg】是现代“山寨”版的该玩具。64个圆盘太多了，所以减为7个，金刚石和黄金都以木头代替了......但道理是相同的。
据说完成大梵天的命令需要太多的移动次数，以至被认为完成之时就是世界末日！
你的任务是精确计算出到底需要移动多少次。
很明显，如果只有2个圆盘，需要移动3次。
圆盘数为3，则需要移动7次。
```
# 思路
* `f(k+1)=2*f(k)+1。此后不难证明f(n)=2^n-1`
* 用biginteger 实现
```


import sun.dc.pr.PRError;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;//基本常量1
        BigInteger b = new BigInteger("2");
        for(int i = 1;i <= 64;i++)
            a = a.multiply(b);//a=a*b
        a = a.subtract(BigInteger.ONE);//a=a-1;
        System.out.println(a);
        }
}
```