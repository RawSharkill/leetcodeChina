import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        List<Integer>list=new LinkedList<>();
        tolist(root,list);
        int t1;
        int t2;
       for(int i=0;i<list.size()-1;i++){
          t1=list.get(i);
          t2=list.get(i+1);
          if(t2<=t1)return false;
       }
       return true;
    }
  public void tolist(TreeNode root, List<Integer>list){
        if(root==null)return;
        if(root.left!=null)tolist(root.left,list);
        list.add(root.val);
        if(root.right!=null)tolist(root.right,list);
  }

}
