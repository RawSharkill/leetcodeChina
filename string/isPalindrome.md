# 题目：
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
# 要求：
* 本题中，我们将空字符串定义为有效的回文串。
* 考虑的内容是字母和数字`if(ss.charAt(i)>='a' && ss.charAt(i)<='z' || ss.charAt(i)>='0' && ss.charAt(i)<='9')`
* string 和stringbuffer的转换和应用的问题
* String 可以使用 equals()函数
* StringBuffer 可以使用reverse()函数以及toString()函数

```
class Solution {
    public static boolean isPalindrome(String s) {
        String ss=s.toLowerCase();//全都变成小写
        //System.out.println(ss);
        int l=ss.length();
        String sq="";
        for(int i=0;i<l;i++)
        {
            if(ss.charAt(i)>='a' && ss.charAt(i)<='z' || ss.charAt(i)>='0' && ss.charAt(i)<='9')
            {
                sq+=ss.charAt(i);
            }
        }
        //System.out.println(sq);
        StringBuffer sb=new StringBuffer(sq);
        sb.reverse();
       // System.out.println(sb);
        String sss=sb.toString();
        if(sq.equals(sss))
            return true;
        else
            return false;
    }
}
```