# 题目：
判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

    * 数字 1-9 在每一行只能出现一次。
    * 数字 1-9 在每一列只能出现一次。
    * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
# 要求： 
    * 一个有效的数独（部分已被填充）不一定是可解的。
    * 只需要根据以上规则，验证已经填入的数字是否有效即可。
    * 给定数独序列只包含数字 1-9 和字符 '.' 。
    * 给定数独永远是 9x9 形式的。

#思路:
* 暴力法：判断每一行，每一列，每一个小方格，是不是符合要求
* 用一个数组来记录每一行（每一列，每个方格）九个数组是否存在的情况，存在置为1，如果又有已经为1 的数字，说明是不符合要求的，直接返回false。
* 注意事项：
     * `int x=board[i][j]-'0';`要减去'0'，才是真正的数字，否则会出现数组越界的情况
     
```
class Solution {
   public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)//9行
        {
            int[]term=new int[10];//每个数字占一个位置
            //初始默认是0？？？
            //检测每一行
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.'){
                    int x=board[i][j]-'0';
                    if(term[x]==1)
                        return false;
                    else
                        term[x]=1;
                }
            }
            }

        for(int i=0;i<9;i++)//9列
        {
            int[]te=new int[10];//每个数字占一个位置
            //初始默认是0？？？
            //检测每一行
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.'){
                    int x=board[j][i]-'0';
                    if(te[x]==1)
                        return false;
                    else
                        te[x]=1;
                }
            }
        }
        //检测9个正方形
        for(int i=0;i<9;i++){
            int[]t=new int[10];
            int x=0+(i%3)*3;
            int y=0+(i/3)*3;
            for(int k=x;k<x+3;k++){
                for(int l=y;l<y+3;l++)
                {
                  if(board[k][l]!='.') {
                      int m = board[k][l]-'0';
                      if (t[m] == 1)
                          return false;
                      else
                          t[m] = 1;
                  }
                }
            }
        }
        return true;
    }
}
```