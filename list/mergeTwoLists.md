# 题目：
将两个有序链表合并为一个新的有序链表并返回。
新链表是通过拼接给定的两个链表的所有节点组成的

# 要求：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

# 思路：
* 两个原本的链表是长度相等的嘛？？？
* 合并后的链表是有序的嘛？值从小到大？？？
* 利用递归的方法做吧
* 每次递归选取链表头的值较小的一个链表的头做merge

```
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        ListNode temp;
        if(l1.val<l2.val){
            temp = l1;
            temp.next= mergeTwoLists(l1.next,l2);
        } 
        else{
            temp = l2;
            temp.next= mergeTwoLists(l1,l2.next);
        }
        return temp;
    }
```