# 题目：
请判断一个链表是否为回文链表。

# 进阶：
能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？

# 思路：
* 用ArrayList存储链表中的数据，然后对数组进行从两头向中间的扫描，进而判断是不是回文

```
public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer>a=new ArrayList<>();
        ListNode p=head;
        while (p!=null)
        {
            a.add(p.val);
            p=p.next;

        }
        int l=a.size();
        for(int i=0;i<l/2;i++){
            if(a.get(i).intValue()!=a.get(l-i-1).intValue())
                return false;
        }
        return true;
    }
```
* 对于进阶的要求
* 用加权求和的方式进行两次遍历，用一个变量存储结果sum;
* 时间复杂度n，空间复杂度1 
