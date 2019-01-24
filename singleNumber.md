题目：
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

要求：
* 你的算法应该具有线性时间复杂度。 
* 你可以不使用额外空间来实现吗？

思路：
* 首先想到的暴力法不可以使用了
```
public static int singleNumber(int[] nums) {
        int l=nums.length;
        if(l==0)
            return 0;
        Arrays.sort(nums);
        for(int i=0;i<l-1;i++) {
            int term =nums[i];
        if(term==nums[i+1])
        {
                i++;
        }
        else
            return nums[i];
        }
        return nums[l-1];
    }
```
* 取异或的方法
只有一个数字是单个的，其他的都是两个的，通过异或的运算方式，将两个的数字变为0，剩下的结果便是单个数字值。
   * ^ 异或，将两个数转换为二进制，从高位开始比较，如果相同则是0，不同则是1。
   * & 位与，将两个数转换为二进制，从高位开始比价，如果都是1则为1，否则为0.
   * | 位或，将两个数转换为二进制，从高位开始比较，只要有一个为1，就为1，否则为0。
   * ~ 位非，将两个数转换为二进制，位是0，则为1.

```
 public static int singleNumber(int[] nums) {
        int l=nums.length;
        if(l==0)
            return 0;
        int sum=0;
        for(int i=0;i<l;i++){
            sum^=nums[i];

        }
        return sum;
    }
``` 