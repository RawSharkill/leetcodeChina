import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int climbStairs(int n) {
        int[]nums=new int[n+1];
        nums[0]=0;
        if(n>=1)
            nums[1]=1;
        if(n>=2)
            nums[2]=2;
        if(n>=3)
        {
            for(int i=3;i<n+1;i++)
                nums[i]=nums[i-1]+nums[i-2];
        }
        return nums[n];
    }
}

