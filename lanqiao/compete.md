# 题目
```
复制代码

某电视台举办了低碳生活大奖赛。题目的计分规则相当奇怪：
每位选手需要回答10个问题（其编号为1到10），越后面越有难度。答对的，当前分数翻倍；答错了则扣掉与题号相同的分数（选手必须回答问题，不回答按错误处理）。
每位选手都有一个起步的分数为10分。
某获胜选手最终得分刚好是100分，如果不让你看比赛过程，你能推断出他（她）哪个题目答对了，哪个题目答错了吗？
如果把答对的记为1，答错的记为0，则10个题目的回答情况可以用仅含有1和0的串来表示。例如：0010110011 就是可能的情况。
你的任务是算出所有可能情况。每个答案占一行。
多个答案顺序不重要。
```
# 注意事项：
* `String s=Integer.toBinaryString(i);`会把二进制前面的０省略掉。在这种要０有意义的题目中，０要自己补上。
```
String s=Integer.toBinaryString(i);
            int t=s.length();
            String q="0000000000";
```
* `sw.charAt(j)`范围
* `sw.charAt(j-1)`的结果是char类型，不能直接和int 类型的进行等价比较
```
char g=sw.charAt(j-1);
                    int d=g-'0';
                    if (d==1)
```

```


import java.util.*;

public class Main {
    public static void main(String[] args) {
        for(int i=179;i<1024;i++){
            String s=Integer.toBinaryString(i);
            int t=s.length();
            String q="0000000000";
            String sw=q.substring(0,10-t)+s;
            //System.out.println();
            int term=10;
            for(int j=1;j<=10;j++){
                if(j-1<sw.length()){
                    char g=sw.charAt(j-1);
                    int d=g-'0';
                    if (d==1)
                        term = term * 2;
                    else
                        term = term - j;
                }
                else
                    break;
            }
            if(term==100)
                System.out.println(sw);
        }

    }
}
```