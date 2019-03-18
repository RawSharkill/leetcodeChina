# 题目
```
你听说过角谷猜想吗？
任意的正整数，比如 5， 我们从它开始，如下规则计算：
如果是偶数，则除以2，如果是奇数，则乘以3再加1.
如此循环，最终必会得到“1” !
本题的要求是，从标准输入给定一个整数n（1<n<300）表示角谷步数
求满足这个角谷步数的最小的正整数
```
* 先实现求角谷步数的函数
* 使用暴力的方法在一个很大数据范围内调用该函数，直到遇到可以满足步数的值就停止。
```

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1 ;i<30000;i++){
            if(step(i)==n)
            {
                System.out.println(i);
                return;
            }
        }
    }
    public static int step(int x) {
        int count = 0;
        if (x == 1)
            return count;
        while (x != 1) {
            if (x % 2 == 0) {
                count++;
                x = x / 2;
            } else {
                x = x * 3 + 1;
                count++;
            }
        }
        return count;
    }
}
```