# 题目
给定一个链表，判断链表中是否有环。

为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

# 思路
 * 设置两个速度不同的指针，一个走两步一个走一步
 * 如果不存在循环的，快的指针会首先遇到null ,这是就可以返回fasle;
 * 如果存在循环，一定会存在一个时刻，快的和慢的重合，这是就返回true;
 * 可以联想操场跑圈，是循环的，一定存在快的和慢的相遇的时刻。
 
```
public class Solution {
     public static boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast=head;
        ListNode slow=head;
        if(fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        else
            return false;
        
        while (fast!=slow){
            if(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            else
                return false;
        }
        return true;
    }
  
        
}
```