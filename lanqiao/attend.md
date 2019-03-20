#　题目
```
A、B、C、D、E、F、G、H、I、J 共10名学生有可能参加本次计算机竞赛，也可能不参加。因为某种原因，他们是否参赛受到下列条件的约束：

   1. 如果A参加，B也参加；
   2. 如果C不参加，D也不参加；
   3. A和C中只能有一个人参加；
   4. B和D中有且仅有一个人参加；
   5. D、E、F、G、H 中至少有2人参加；
   6. C和G或者都参加，或者都不参加；
   7. C、E、G、I中至多只能2人参加   
   8. 如果E参加，那么F和G也都参加。
   9. 如果F参加，G、H就不能参加
   10. 如果I、J都不参加，H必须参加

请编程根据这些条件判断这10名同学中参赛者名单。如果有多种可能，则输出所有的可能情况。每种情况占一行。参赛同学按字母升序排列，用空格分隔。

比如：
C D G J
就是一种可能的情况。
```
* 看似很简单的是个要求，写函数的时候要十分注意细节
  * `如果A参加，B也参加；`应该是如果Ａ参加了Ｂ没有参加，返回false,其他返回true.
  * 真是个智障　　
```

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] letter = {'A', 'B', 'C','D', 'E', 'F', 'G', 'H', 'I', 'J'};
        int[] re = new int[letter.length];
        seek(letter,0,re);
    }
    public static void seek(char[]letter,int k,int[]re){
        if(k>letter.length-1) {
            String an = "";
            for (int i = 0; i < letter.length; i++) {
                if (re[i] == 1)
                    an += letter[i];
            }

            if (c1(an) && c2(an) && c3(an) && c4(an) && c5(an) && c6(an) && c7(an) && c8(an) && c9(an) && c10(an)) {

            System.out.println(an);
                return;
            }
            else {
                return;
            }
        }
        re[k] = 1;
        seek(letter, k + 1, re);
        re[k] = 0;
        seek(letter, k + 1, re);
        return;
    }
    public static boolean c1(String s){
        if(s.contains("A")&&!s.contains("B"))
            return false;
        return true;
    }
    public static boolean c2(String s){
        if(!s.contains("C") && s.contains("D"))
            return false;
        return true;
    }
    public static boolean c3(String s){
        if(s.contains("A") && s.contains("C"))
            return false;
        return true;
    }
    public static boolean c4(String s){
        if(s.contains("B")&& s.contains("D") || !s.contains("B")&&!s.contains("D"))
            return false;
        return true;
    }
    public static boolean c5(String s) {
        int count=0;
        for(int i=0;i<5;i++){
            char x=(char)('D'+i);
            if(s.contains(""+x))
                count++;
        }
        if(count>=2)
            return true;
        return false;
    }
    public static boolean c6(String s){
        if(s.contains("C") && s.contains("G") || !s.contains("C")&& !s.contains("G"))
            return true;
        return false;
    }
    public static boolean c7(String s){
        int count=0;
        for(int i=0;i<7;i=i+2){
            char x=(char)('C'+i);
            if(s.contains(""+x))
                count++;
        }
        if(count<=2)
            return true;
        return false;
    }
    public static boolean c8(String s){
        if(s.contains("E") && (!s.contains("F")  || !s.contains("G")))
            return false;
       return true;
    }
    public static boolean c9(String s){
        if(s.contains("F") && (s.contains("G") ||s.contains("H")))
            return false;
        return true;
    }
    public static boolean c10(String s){
        if(!s.contains("I") && !s.contains("J") && !s.contains("H"))
            return false;
        return true;
    }
}
```