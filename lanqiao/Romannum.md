# 题目
```
 古罗马帝国开创了辉煌的人类文明，但他们的数字表示法的确有些繁琐，尤其在表示大数的时候，现在看起来简直不能忍受，所以在现代很少使用了。之所以这样，不是因为发明表示法的人的智力的问题，而是因为一个宗教的原因，当时的宗教禁止在数字中出现0的概念！

    罗马数字的表示主要依赖以下几个基本符号：

    I  1
    V  5
    X  10
    L  50
    C  100
    D  500
    M  1000
     输入格式是：第一行是整数n,表示接下来有n个罗马数字(n<100)。以后每行一个罗马数字。罗马数字大小不超过999。

    要求程序输出n行，就是罗马数字对应的十进制数据。

```
* 首先将单个罗马字符转换成相应的十进制数字
* 一次读取两个字符，如果前小后大，则` sum+=b-a;`并且将索引后移一位`i++;`
* 如果两个字符相等或者前大后小，则` sum+=a;`把第二个字符留到下一次循环再进行检测。
```

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<String>list=new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextLine());
        }
        for(int i=0;i<list.size();i++) {
            //System.out.println("fuck"+list.get(i));
            System.out.println(test(list.get(i)));
        }

    }
    public static int getnum(char x){
        switch (x){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public static int test(String s){
            int sum=0;
            for(int i=0;i<s.length();i++){
                int a=getnum(s.charAt(i));
                int b;
                if(i+1<s.length())
                {
                    b=getnum(s.charAt(i+1));
                }
                else
                    b=0;
                if(a<b)
                {
                    sum+=b-a;
                    i++;
                }
                else
                    sum+=a;
            }
           return sum;

    }
}
```