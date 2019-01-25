# 题目：
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

# 要求：
* 你可以假设字符串只包含小写字母。

# 思路：
* 可以用map来记录每个字符串出现的各个字母的个数进行对比
* 实现中注意的地方！！！！
* `if(sl==0 && tl==0) return true;`长度是0的情况要考虑
* 注意map的用法！！！！！
* ` int term=tm.get(tc)+1; tm.put(tc,term);`
```
 for(int i=0;i<tl;i++){
            char tc=t.charAt(i);
            if(tm.containsKey(tc)){
                int term=tm.get(tc)+1;
                tm.put(tc,term);
            }
            else{
            tm.put(tc,1);
            }
        }
```


```
class Solution {
   public static boolean isAnagram(String s, String t) {
        Map<Character,Integer>sm=new HashMap<>();
        Map<Character,Integer>tm=new HashMap<>();

        int sl=s.length();
        int tl=t.length();
        if(sl!=tl)
            return false;
      if(sl==0 && tl==0)
          return true;
        char g=s.charAt(0);
        for(int i=0;i<sl;i++) {
            Character sc = s.charAt(i);
            if (sm.containsKey(sc)) {
                int term = sm.get(sc) + 1;
                sm.put(sc, term);
            } else {
                sm.put(sc, 1);
            }
        }
        for(int i=0;i<tl;i++){
            char tc=t.charAt(i);
            if(tm.containsKey(tc)){
                int term=tm.get(tc)+1;
                tm.put(tc,term);
            }
            else{
            tm.put(tc,1);
            }
        }
        
        for(Character v : sm.keySet()){
            if(sm.get(v)==null || tm.get(v)==null )
                return false;
            int d1=sm.get(v);
            int d2=tm.get(v);
            if(d1!=d2)
                return false;
        }
        return true;
    }
}
```
