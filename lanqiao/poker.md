# 题目
```
小明刚上小学，学会了第一个扑克牌“魔术”，到处给人表演。魔术的内容是这样的：
他手里握着一叠扑克牌：A，2，....J，Q，K 一共13张。他先自己精心设计它们的顺序，然后正面朝下拿着，开始表演。
只见他先从最下面拿一张放到最上面，再从最下面拿一张翻开放桌子上，是A；然后再从最下面拿一张放到最上面，再从最下面拿一张翻开放桌子上，是2；......如此循环直到手中只有一张牌，翻开放桌子上，刚好是K。
这时，桌上牌的顺序是：A,2,3,4,5,6,7,8,9,10,J,Q,K
请你计算一下，小明最开始的时候手里牌的顺序是怎样的。
把结果写出来，逗号分割，小明“魔术”开始时，最下面的那张牌输出为第一个数据。
考场不提供扑克牌，你只能用计算机模拟了，撕碎草稿纸模拟扑克属于作弊行为！另外，你有没有把录像倒着放过？很有趣的！回去试试！

```
# 解答
* 输入问题，注意小细节妈的智障
* 写一下拿牌过程，分析一下原理

```


import sun.dc.pr.PRError;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      char[]num={'A','2','3','4','5','6','7','8','9','t','J','Q','K'};
        print(num);
    }
    public static void print(char[]num){
        char[]origin=new char[num.length];
        boolean[]o=new boolean[num.length];
        for(int i=0;i<num.length;i++){
            o[i]=false;
        }
        int flag=0;
        int j=-1;
        for(int i=0;i<num.length;i++){
            for(;;){
                j=(j+1)%num.length;
                if(flag<2){
                    if(o[j]==false)
                        flag++;
                }
                if(flag==2)
                {
                    origin[j]=num[i];
                    o[j]=true;
                    flag=0;
                    break;
                }
            }
        }

        for(int k=0;k<num.length;k++)
            System.out.print(origin[k]+" ");
        return;
    }

}
```