import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
//    public int maxSubArray(int[] nums) {
//        int sum=nums[0];//最终结果的记录
//        int n=nums[0];//中间结果的记录
//        for(int i=1;i<nums.length;i++)
//        {
//            if(n>0)//当前的值是否大于０　如果大于０　则继续加上后面的数
//                n+=nums[i];
//            else//不大于０　那么从下一个数开始重新选取序列
//                n=nums[i];
//            if(sum<n)//选择最大的值保留在sum
//                sum=n;
//        }
//        return sum;
//    }

    //标准动态规划：
    public static int maxSubArray(int[] nums) {
        int []sum=new int[nums.length];
        //sum[i]表示以i结尾的最大子序列和
        int term=nums[0];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           sum[i]=Math.max(sum[i-1]+nums[i],nums[i]);
        }
        int k=0;
        for(int i=1;i<sum.length;i++)
        {
            if(sum[i]>sum[k])
                k=i;
        }
        return sum[k];
    }
    public static void main(String[]args){
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

