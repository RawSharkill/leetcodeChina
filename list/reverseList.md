# 题目：
反转一个单链表。
# 要求：
* 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

#思路：
* 迭代法
```
public static ListNode reverseList(ListNode head) {
        ListNode n=null;
        ListNode p=head;
        while (p!=null){
            ListNode tmp=p.next;
            p.next=n;
            n=p;
            p=tmp;
        }
        return n;
    }
```