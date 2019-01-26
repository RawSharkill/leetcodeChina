# 题目：
实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

# 要求：
* 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
* 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

# 思路：
* 首先找到首字母相符的位置，然后利用substring()函数截取相应长度的字符串与目标字符串进行对比。
* 注意特殊的情况
* `if((i+nl-1)<=hl-1)`这个条件？？？？

```
class Solution {
 public static int strStr(String haystack, String needle) {
        int hl=haystack.length();
        int nl=needle.length();
        if(nl==0)
            return 0;
        if(hl==0)
            return -1;
        if(hl<nl)
            return -1;
        for(int i=0;i<hl;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if((i+nl-1)<=hl-1) {
                    String str = haystack.substring(i, i + nl);
                    if (str.equals(needle))
                        return i;
                }
                else
                    return -1;
            }
        }
        return -1;
    }
}
```
