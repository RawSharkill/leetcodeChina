题目：
给定一个整数数组，判断是否存在重复元素。

如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

要求：
* 没有要求
* 空数组返回0

思路：
* 暴力暴力
竟然还可以通过，果然是一点要求都没有，我真是佛了。
```
public boolean containsDuplicate(int[] nums) {
                int l=nums.length;
                if(l==0)
                    return false;
                for(int i=0;i<l;i++)
                {
                    for(int j=i+1;j<l;j++)
                    {
                        if(nums[i]==nums[j])
                            return true;
                    }
                }
                return false;
}
```

* 将数组向list里写入，通过list的contains函数记性判断。
```
public boolean containsDuplicate(int[] nums) {
                int l=nums.length;
                if(l==0)
                    return false;
            List<Integer> num=new LinkedList<>();
            for(int i=0;i<l;i++)
            {
               if(num.contains(nums[i]))
                   return true;
               else
                num.add(nums[i]);
            }
            return false;
}
```