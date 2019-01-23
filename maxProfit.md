题目：
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

要求：
* 没有规定交易次数
* 3 4 5 可以分成（3买入，4 卖出），（4买入，5卖出）；这与3买入，5卖出是一样的结果。但是在价格是4的这一天，可以看成虚拟的两次活动，卖出和买入，就相当于保持。

```
class Solution {
    public static int maxProfit(int[] prices) {
        int l=prices.length;
        if(l==0)
            return 0;
        int max=0;
        for(int i=1;i<l;i++)
        {
            int term=prices[i]-prices[i-1];
            if(term>0)
                max+=term;
        }
        return max;

    }
    public static void main(String[]args){
        int[]p={1,2,3,4,5};
        System.out.println( maxProfit(p));
    }
}
```
[其他要求的解法](https://blog.csdn.net/i_am_bird/article/details/78190309)