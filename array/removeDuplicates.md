# 题目
 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

***
要求和信息：
* 是一个排序数组
* 只能在原数组空间修改 
* 时间是常数

```
public static int  removeDuplicates(int[] nums) {
            int k = 0;
            int l = nums.length;
            if (l == 0)
                return 0;
            for (int i = 1; i < l; i++) {
                if (nums[i] != nums[k])
                    nums[++k] = nums[i];
            }
            return k+1;
        }
```