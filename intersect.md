# 题目：
给定两个数组，编写一个函数来计算它们的交集。
# 要求：
* 输出的元素个数应与元素在两个数组中出现的个数一致
* 不考虑输出顺序

# 思路：
* 因为题目中要求输出的元素个数与数组中的个数一致，那么就要用到map来记录数组中的元素以及其相应的个数。
* 为什么不用两个map？因为只要有一个在记录个数，对另一个进行遍历就可以了。

```
 public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++)
        {
            Integer term=map.get(nums1[i]);
            map.put(nums1[i],term==null ? 1 : (term+1));
        }
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j])!=0)
            {
                list.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);//减一
            }
        }
        int[]result=new int[list.size()];
        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }
        return result;
    }
```  
 
# 进阶:
    * 如果给定的数组已经排好序呢？你将如何优化你的算法？
    * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
    * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？

# 思路：
* 将两个数组排序，同时比较，下标移动的方法。
* 如果一个数组比另一个数组小的多，那么应该用小的数组在大的数组中遍历的方法，找到相同的则停止此次遍历，将改元素加入结果。在进行下一个元素的查找。
```
 Arrays.sort(nums1);
        Arrays.sort(nums2);

        //假设两个数组已经排序了
        int i=0;
        int j=0;
        List<Integer>list=new LinkedList<>();
        while(i<nums1.length && j<nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        int[] result = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }

        return result;
```        