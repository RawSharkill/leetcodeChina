import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists=new LinkedList<>();
        List<Integer>list=new LinkedList<>();
        List<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return lists;
        TreeNode cur;
        queue.add(root);
        list.add(root.val);
        lists.add(list);
        int count=1;//层数是１
        int next=0;
        while (!queue.isEmpty()){
            List<Integer>l=new LinkedList<>();
            while (count!=0)
            {
                cur = ((LinkedList<TreeNode>) queue).getFirst();//取出队列中的第一个元素
                queue.remove(0);//pop
                count--;
                if (cur.left != null)
                {
                    queue.add(cur.left);
                    l.add(cur.left.val);
                    next++;
                }

                if (cur.right != null) {
                    queue.add(cur.right);
                    l.add(cur.right.val);
                    next++;
                }

            }
            if(l.isEmpty())
                return lists;
            else {
                lists.add(l);
                count = next;
                next = 0;
            }
        }
        return lists;
    }
}
