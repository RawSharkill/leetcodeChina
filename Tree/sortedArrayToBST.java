import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return atob(nums,0,nums.length-1);
    }
    public TreeNode atob(int []nums,int s,int e){
        if(s<=e)
        {
            int mid=(s+e)/2;
            TreeNode t=new TreeNode(nums[mid]);
            t.left=atob(nums,s,mid-1);
            t.right=atob(nums,mid+1,e);
            return t;
        }
        return null;
    }
}
