import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left==null && root.right ==null))
            return true;
        return search(root.left,root.right);
    }
    public boolean search(TreeNode left,TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null ||right==null)
            return false;
        else{
            return (left.val==right.val) && search(left.left,right.right) &&search(left.right,right.left);
        }
    }
}
