# 题目：
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

# 要求：
* 用数组中的两个数组成目标值
* 不能重复使用同一个元素
* 这个数组是已经排序的嘛？？？？

# 思路：
* 现将数组排序，两个指针一前一后的移动
```
public static int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        List<Integer>list=new LinkedList<>();
        for(int i=0;i<l;i++)
            list.add(nums[i]);

        Arrays.sort(nums);
        int i=0;
        int j=l-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum>target)
                j--;
            if(sum<target)
                i++;
            if(sum==target)
            {
               int x=list.indexOf(nums[i]);
               list.set(x,-1);
               int y=list.indexOf(nums[j]);
                int []re={x,y};
                return re;
            }
        }
        return null;
    }
```
* 暴力法就是双重循环一次查看。
