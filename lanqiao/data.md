# 题目
```
1949年的国庆节（10月1日）是星期六。 
今年（2012）的国庆节是星期一。
那么，从建国到现在，有几次国庆节正好是星期日呢？
只要答案，不限手段！
可以用windows日历，windows计算器，Excel公式，。。。。。
当然，也可以编程！
不要求写出具体是哪些年，只要一个数目！
```
* 这个题很简单，查看一下日历发现，１９５０年的国庆解恰好是周日，所以只要看一年后也就是３６５或者３６６是不是可以整除７
* 对于闰年的计算也要注意`i%400==0 || (i%4==0 && i%100!=0)`
* `day+=year;if(day%7==1)`
```
import sun.dc.pr.PRError;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count=0;
        int day=0;
        for(int i=1950;i<2020;i++){
            int year=365;
            if(i%400==0 || (i%4==0 && i%100!=0)){//闰年计算方法！！！
                year=366;
            }
            day+=year;
            if(day%7==1){//1950年的国庆是周日
                count++;
                System.out.println(i);
            }
        }
        System.out.print(count);
    }
}
```