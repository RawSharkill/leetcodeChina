# 题目：
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

# 要求
* 必须在原数组上操作，不能拷贝额外的数组。
* 尽量减少操作次数。

# 思路
* 从后向前将0元素交换到最后
* 从最后一个元素开始查看，如果是非零，则减一（看前一个），如果是零，则将零元素一步一步交换到数组最后一个的位置。

```
public static void moveZeroes(int[] nums) {
        int l=nums.length;
        if(l==0)
            return;
        for(int i=l-1;i>=0;i--){
            if(nums[i]==0)
            {
                int k=i;
                while(k<l-1){
                    int term=nums[k+1];
                    nums[k+1]=nums[k];
                    nums[k]=term;
                    k++;
                    }
            }
        }
    }
```