# 题目
```
  某少年宫引进了一批机器人小车。可以接受预先输入的指令，按指令行动。小车的基本动作很简单，只有3种：左转（记为L），右转（记为R），向前走若干厘米（直接记数字）。

    例如，我们可以对小车输入如下的指令：

    15L10R5LRR10R20

    则，小车先直行15厘米，左转，再走10厘米，再右转，...
```
* 用一个全局的flag记录当前的朝向,1,2,3,4
* 对检测到的数字，记录在不同朝向的位置上` p[flag]+=Integer.valueOf(num);        `
* 对于检测到'L','R'对于flag的转向
* 最后的格式化输出` System.out.printf("%.2f \n",re);   `
```
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import sun.dc.pr.PRError;

import java.math.BigInteger;
import java.util.*;

public class Main {
   static int[] p;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        for(int k=0;k<n;k++)
            run(s[k]);
    }
    public static void run(String s){
        p=new int[5];
        int flag=1;
        String num="";
        for(int i=0;i<s.length();i++){
            if(num(s.charAt(i)))
            {
                num+=s.charAt(i);
                int index=i+1;
                while(index<s.length() && num(s.charAt(index)))
                {
                    num+=s.charAt(index);
                    index++;
                }
                p[flag]+=Integer.valueOf(num);
                num="";
                i=index-1;
            }
            else{
                    if(s.charAt(i)=='L')
                    {
                        int h=flag-1;
                        if(h==0)
                            flag=4;
                        else
                            flag=h;
                    }
                    else{
                        int g=flag+1;
                        if(g==5)
                            flag=1;
                        else
                            flag=g;
                    }
                }
            }
        int x=p[1]-p[3];
        int y=p[2]-p[4];
        float re=(float)Math.sqrt(x*x+y*y) ;
        System.out.printf("%.2f \n",re);
    }
    public static boolean num(char x){
        if(x>='0' && x<='9')
            return true;
        return false;
    }
}
```