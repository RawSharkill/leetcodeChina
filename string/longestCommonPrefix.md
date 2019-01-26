# 题目：
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
# 思路：
* 暴力法，以第一个字符串为基准，一次比较其他的字符串前缀是否相等
* 改进： 选取最短的字符串作为基准，可以避免第一个没查找完，后边字符串却查找完的情况
* 注意各种结束情况：
   * 第一个字符串查找到末尾了 i=strs[0].length()-1;
   * 后面某个字符串比较结束了 i=strs[j].length()-1;
   * 遇到不相等的字符，就返回当前的i个字符作为公共前缀。


```
public static String longestCommonPrefix(String[] strs){
        if(strs.length==0)
            return "";
        int i;
        int j=1;
        for(i=0;i<strs[0].length();i++){
            for(j=1;j<strs.length;j++){
                if(i<strs[j].length())
                {
                    if(strs[0].charAt(i)!=strs[j].charAt(i))
                        return strs[0].substring(0,i);
                }
                else
                    return strs[0].substring(0,i);
            }
            j=1;
        }
        return strs[0];
    }
```