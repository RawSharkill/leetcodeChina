# 题目：
请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

现有一个链表 -- head = [4,5,1,9]，它可以表示为:

# 说明：
* 链表至少包含两个节点。
* 链表中所有节点的值都是唯一的。
* 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
* 不要从你的函数中返回任何结果。

# 思路：
* 最开始还觉得这个题有点奇怪，因为他没有给出链表的表头
* 我真是个智障啊
* 首先把要删除的结点的后一个的值赋给要删除的结点`node.val=node.next.val;`
* 再把要删除的结点的后一个结点删掉，就可以得到相同的效果（ 因为不知道要删除的结点的前一个结点，所以要删除的结点不能被操作）
* 我真是个小可爱

```
 public static void deleteNode(ListNode node) {
        if(node.next==null)
            return;
        node.val=node.next.val;
        ListNode term=node.next;
        node.next=node.next.next;

    }
```