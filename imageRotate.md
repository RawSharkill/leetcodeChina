# 题目：
给定一个 n × n 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。

# 要求
* 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。

# 思路：
* 迭代，重复调用（我已经忘记叫什么方法了）
* 先写一个函数去处理n*n的方格最外边的四个方向的数值的旋转，最后在总的函数中进行循环调用，将每一层的方格最外的四个方向的值进行交换。
* 比较难写的是数值旋转之后的赋值问题，其实可以先将四个边的值存在数组中，然后在进行一一赋值，因为我比较懒，所以直接写的，但是改了几次才成功。
* 下次注意
```
class Solution {
     public static void rotate(int[][] matrix) {
        int l=matrix.length;
        for(int i=0;i<l/2;i++){
            r(matrix,i);
        }
    }
    public static void r(int[][]matrix,int k){
        int l=matrix[k].length;
        int n=l-2*k;//长度
        int[]term=new int[n];
        int count=0;
        //将上方第一行保存起来
        for(int i=k;i<k+n;i++)
        {
            term[count]=matrix[k][i];
            count++;
        }
        //给第一行赋值
        int c=0;
        for(int i=k;i<l-k;i++){
            matrix[k][i]=matrix[l-k-1-c][k];
            c++;
        }
        //给第一列赋值
        int b=0;
        for(int i=k;i<k+n;i++){
            matrix[i][k]=matrix[l-k-1][k+b];
            b++;
        }

        //给最后一行赋值
        int a=0;
        for(int i=k;i<k+n;i++)
        {
            matrix[l-k-1][i]=matrix[l-k-1-a][l-k-1];
            a++;
        }

        //给最后一列赋值
        int d=0;
        for(int i=k;i<k+n;i++)
        {
            matrix[i][l-k-1]=term[d];
            d++;
        }
    }
}
```