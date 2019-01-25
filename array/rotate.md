题目：
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]

要求：
* 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
* 要求使用空间复杂度为 O(1) 的原地算法。
* 没有对时间复杂度进行要求

思路：
* 真实的一个个的旋转移动，这样的时间复杂度是O（k*n)
```
 public static void rotate(int[] nums, int k) {
           int l=nums.length;
           if(l==0 || k==0)
               return;
           if(k<0)
               return;
            for(int i=0;i<k;i++)
            {
                int term=nums[l-1];
                for(int j=l-1;j>0;j--)
                {
                    nums[j]=nums[j-1];
                }
                nums[0]=term;
            }
            return;
 }
 ```
 * 利用翻转函数来做，先将数组整体翻转，之后在将前K个翻转，后N-K个翻转。
 但是这样有一个问题是，如果旋转的k>l（数组的长度），这个方法就是失效了。需要进一步改正。
```
 public static void rotate(int[] nums, int k) {
           int l=nums.length;
           if(l==0 || k==0)
               return;
           if(k<0)
               return;
           //将整体翻转
           for(int i=0;i<l/2;i++)
           {
               int term=nums[i];
               nums[i]=nums[l-i-1];
               nums[l-i-1]=term;
           }
           //将前后各自翻转
            for(int i=0;i<k/2;i++)
            {
                int term=nums[i];
                nums[i]=nums[k-i-1];
                nums[k-i-1]=term;
            }
            for(int i=k;i<(l-k)/2+k;i++)
            {
                int term=nums[i];
                nums[i]=nums[l+k-i-1];
                nums[l+k-i-1]=term;
            }
                return;
        }
```

