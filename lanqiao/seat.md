# 题目
```
要安排：3个A国人，3个B国人，3个C国人坐成一排。
要求不能使连续的3个人是同一个国籍。
求所有不同方案的总数？
```
* 排列组合问题？
* dfs
```
import sun.dc.pr.PRError;

import java.util.*;

public class Main {
    static int count=0;
    public static void main(String[] args) {
        int[]A={1,2,3};
        dfs(A,0);
        //System.out.print(count);
    }
    public static void swap(int[]A,int a,int b){
        int term=A[a];
        A[a]=A[b];
        A[b]=term;
    }
    public static void dfs(int[]A,int step){
        if(step==A.length){
            if(check(A)){
                count++;
                return;
            }
            System.out.println(A[0]+" "+A[1]+" "+A[2]);
        }
        else {
            for(int i=step;i<A.length;i++){
                swap(A,i,step);
                dfs(A,step+1);
                swap(A,i,step);
            }
        }

    }
    public static boolean check(int[]A){
        for(int i=2;i<A.length;i++){
            if(A[i-1]==A[i-2] && A[i]==A[i-1])
                return false;
        }
        return true;
    }

}
```