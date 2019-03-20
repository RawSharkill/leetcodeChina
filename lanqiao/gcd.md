# 题目
```
我们希望寻找到能除尽1至n的的每个数字的最小整数。

不要小看这个数字，它可能十分大，比如n=100, 则该数为：
69720375229712477164533808935312303556800
```
* 可能是很大的数字时，用`BigInteger`
* `BigInteger`方法：
https://www.cnblogs.com/cangqinglang/p/8992312.html
* BigInteger(String val);
* BigInteger(String val,int radix);
* remainder(); 取余
* gcd(); 最大公约数

```

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        BigInteger re=new BigInteger("1");
        for(int i=1;i<=n;i++){
            BigInteger gcd=re.gcd(new BigInteger(""+i));
            re=re.multiply(new BigInteger(""+i));
            re=re.divide(gcd);
        }
        System.out.println(re);
    }
}
```