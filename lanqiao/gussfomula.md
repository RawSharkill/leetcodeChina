# 题目
```
猜算式

你一定还记得小学学习过的乘法计算过程，比如：

   273
x   15
------
  1365
  273
------
  4095
  
请你观察如下的乘法算式

    ***
x   ***
--------
    ***
   ***
  ***
--------
  *****
  
星号代表某位数字，注意这些星号中，
0~9中的每个数字都恰好用了2次。
(如因字体而产生对齐问题，请参看图p1.jpg)

请写出这个式子最终计算的结果，就是那个5位数是多少？

注意：只需要填写一个整数，不要填写任何多余的内容。比如说明文字。

```
* 设置全局变量count来记录每个数字出现的次数，这样就不用使大量的空间来记录每个数拆分后的结果。
```
public static void get(int j) {
            String q = j + "";
            char[] ww = q.toCharArray();
            t=ww;
            for (int i = 0; i < ww.length; i++) {
                int po=(int)(ww[i] - '0');
                count[po]++;
            }
        }
```
* 最后的输出格式
```

                   if(check())
                    System.out.println(i+"*"+j+"="+x);

```
* 
```

    import java.math.BigInteger;
    import java.util.*;

    public class Main {
        static int[] count;
        static char[] t;
        public static void main(String[] args) {
            for (int i = 100; i < 999; i++) {
                for (int j = 100; j < 999; j++) {
                    count=new int[10];
                    t=new char[3];
                    int x=i*j;
                    get(i);
                    get(j);
                    char[]p=t;
                    get(x);
                    get(i*(int)(p[0]-'0'));
                    get(i*(int)(p[1]-'0'));
                    get(i*(int)(p[2]-'0'));
                }
            }
        }

        public static void get(int j) {
            String q = j + "";
            char[] ww = q.toCharArray();
            t=ww;
            for (int i = 0; i < ww.length; i++) {
                int po=(int)(ww[i] - '0');
                count[po]++;
            }
        }
        public static boolean check(){
            for(int m=0;m<10;m++) {
                if(count[m]!=2)
                    return false;
            }
            return true;
        }
    }
```