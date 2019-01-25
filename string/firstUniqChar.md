# 题目：
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

#要求：
* 没有特殊要求
* 假设全是小写字母

# 思路：
* 首先想到的数据结构是map
* 注意！！！map存储的顺序是哈希表的顺序不是放入的顺序，这样首先遇到的为1 的字符不一定是字符串中的第一个，所以应该在选出的字符中寻找最小下标的一个字符。


```
public static int firstUniqChar(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            Character c=s.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        List<Character> list=new LinkedList<>();
        for(Character m : map.keySet())
        {
            if(map.get(m)==1)
            {
                list.add(m);
            }
        }
        if(list.isEmpty())
            return -1;
        int min=l;
        for(Character d : list){
            int y=s.indexOf(d.charValue());
            if(y<min)
                min=y;
        }
        return min;
    }
```