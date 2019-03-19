# 题目
```
在图形环境中很容易做出漂亮的表格。但在控制台环境中就比较困难了。有的时候可以用一些符号大略地模拟：（word文档中可能不整齐，拷贝到记事本中看）
+-------+------+
|abc    |xyz=tt|
+-------+------+
|hellomm|t2    |
+-------+------+

本题目要求设计一个程序，把用户输入的内容用这种“准表格”的方式展现出来。具体的要求是：
用户输入的第一行是一个整数，表示接下来有多少行信息。接下来的每行由若干单元组成。单元间用逗号分开。
程序输出：用表格方式重新展现的输入内容。
两个连续的逗号表示中间有一个内容为空的单元
列的数目由最大的单元数的那行决定
列的宽度由同列的最宽的单元决定
单元格中的信息左对齐

可以假设：用户输入的最大行数为30，可能的最多列数为40。
```
* 输入的scanner不会忽略回车`int n= Integer.parseInt(scanner.nextLine());`如果下一个输入是回车后的string ，那么就要这样读取一行。
* `  String str=scanner.nextLine();`
# printf的格式化输出
 *  `System.out.printf("%"+w+"s",x[j]);`
 * "%8d" 整数，输出宽度为８，右对齐
 * "%-6d" 整数，输出宽度为６，左对齐
 * "%.2f"　浮点数，小数点后两位
 * "16.3f" 浮点数，小数点后三位，输出宽度１６
```

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        List<String[]> lists=new LinkedList<>();
        int[]weight=new int[40];
        int count=0;
        for(int i=0;i<n;i++){
            String str=scanner.nextLine();
            //System.out.println(str);
                String[] list=str.split(",");
                count=(count > list.length )? count :list.length;
                lists.add(list);
        }
        for(int i=0;i<count;i++){
            for(int j=0;j<n;j++){
                String[]term=lists.get(j);
                if(term.length>i) {
                    if (weight[i] < term[i].length())
                        weight[i] = term[i].length();
                }
            }

        }

        System.out.println();
        for(int i=0;i<n;i++){
            String[] x=lists.get(i);
            split(weight,count);
            for(int j=0;j<count;j++){
                System.out.print("|");
                int w=(-1)*weight[j];
                if(j>=x.length)
                    System.out.printf("%"+w+"s"," ");
                else
                System.out.printf("%"+w+"s",x[j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void split(int[]we,int count){
        for(int i=0;i<count;i++){
            System.out.print("+");
            for(int j=0;j<we[i];j++)
                System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
}
```
