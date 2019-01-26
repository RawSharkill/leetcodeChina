# 题目：
请你来实现一个 atoi 函数，使其能将字符串转换成整数。

首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。

当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。

该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。

# 要求：
* 假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
* 在任何情况下，若函数不能进行有效的转换时，请返回 0。
* 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，qing返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。

# 思路：
* 这个题的难点在在于特殊情况的处理和考虑
* 开头是空格字符，需要将空格过滤掉，但是`str="   "`考虑了吗？？？
* 开头是字母，直接返回0
* 开头是“+” 或者“-”，保留，继续读后续的数字，但是`str="+"`,`str="+a"`考虑了吗？？？
* 三思后提交


```
import java.math.BigDecimal;
class Solution {
    public static int myAtoi(String str) {
        int l=str.length();
        if(l==0)
            return 0;
           int k=0;
        while( k<str.length() && str.charAt(k)==' ')
            k++;
        str=str.substring(k);
        if(str.length()==0)
            return 0;
        String re="";
        if(str.charAt(0)=='-' || str.charAt(0)=='+'){
            re+=str.charAt(0);
            for(int i=1;i<str.length();i++)
            {
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    re+=str.charAt(i);
                }
                else
                    break;
            }
            if(re.length()==1)
                return 0;
        }
        else if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            int i=0;
            while (i<str.length() &&  str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                re+=str.charAt(i);
                i++;
            }
        }
        else if(str.charAt(0)==' '){
            int j=0;
            while(j<str.length() && str.charAt(j)==' ')
                j++;
            if(j<str.length() && str.charAt(j)>='0' && str.charAt(j)<='9'){
                while (j<str.length() &&  str.charAt(j)>='0' && str.charAt(j)<='9')
                {
                    re+=str.charAt(j);
                    j++;
                }
            }
            else
                return 0;
        }
        else
            return 0;

        BigDecimal bigDecimal=new BigDecimal(re);
        if(bigDecimal.compareTo(new BigDecimal(Integer.MAX_VALUE))!=-1)
            return Integer.MAX_VALUE;
        if(bigDecimal.compareTo(new BigDecimal(Integer.MIN_VALUE))!=1)
            return Integer.MIN_VALUE;
        else
            return bigDecimal.intValue();
    }

}
```
