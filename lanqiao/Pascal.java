

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
       List<Integer>num=new LinkedList<>();
       num.add(1);//初始
        System.out.println(1);
        for(int i=1;i<n;i++){
            List<Integer>term=new LinkedList<>();
            term.add(1);
            for(int j=0;j<num.size();j++){
                if(j+1<num.size())
                    term.add(num.get(j)+num.get(j+1));
                else
                    break;
            }
            term.add(1);
            for(int p=0;p<term.size();p++)
                System.out.print(term.get(p)+"  ");
            System.out.println();
            num=term;
            }
        }
}