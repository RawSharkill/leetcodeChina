import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        List<Integer>list=new LinkedList<>();
        for(int i=0;i<prices.length-1;i++){
            list.add(prices[i+1]-prices[i]);
        }
        int term=0;
        int max=0;
        for(int i=0;i<list.size();i++){
            if((term+list.get(i))>0)
                term+=list.get(i);
            else
                term=0;
            max=Math.max(max,term);
        }
        return max;
    }
}

