import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        int[]sum=new int[nums.length+1];
        if(nums.length>=1)
        sum[0]=nums[0];
        if(nums.length>=2)
        sum[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            sum[i]=Math.max(sum[i-2]+nums[i],sum[i-1]);
        }
        return sum[nums.length-1];
}
    public static void main(String[]args){
        int[]n={2,7,9,3,1};
        System.out.println( rob(n));
     }
}

