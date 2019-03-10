

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer>num=new LinkedList<>();
        for(int i=0;i<n;i++){
            num.add(scanner.nextInt());
        }
        int a=scanner.nextInt();
//        int count=1;
//        for(Integer x : num){
//            if(x==a)
//            {
//                System.out.println(count);
//                return;
//            }
//            count++;
//        }
//        System.out.println(-1);
        if(!num.contains(a))
        {
            System.out.println(-1);
            return;
        }
        System.out.println(num.indexOf(a)+1);
  }
}