# 题目：
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
# 说明：
给定的 n 保证是有效的。
# 进阶：
你能尝试使用一趟扫描实现吗？
# 思路：
* 哎呀提交debug大法太蠢了
* 注意很多特殊情况
   * 删除最后一个？
   * 删除第一个？
   * 只有一个元素的链表删除完是null

* 需要重新写！！！！！
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode p=head;
        while (p.next!=null)
        {
            count++;
            p=p.next;
        }
        count++;
       // System.out.println(count);
        if(count==1)
            return null;
        else {
            int x = count - n;
            if(x==0)
            {
                head=head.next;
                return head;
            }
            else {
                p = head;
                while (x > 1) {
                    p = p.next;
                    x--;
                }
                if (n == 1)
                    p.next = null;
                else {
                    p.next = p.next.next;
                }
                return head;
            }
        }
    }
}
```