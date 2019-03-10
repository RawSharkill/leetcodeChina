

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int min=10001;
        int max=-10001;
        int sum=0;
        for(int i=0;i<n;i++){
            int term=scanner.nextInt();
            if(term<min)
                min=term;
            if(term>max)
                max=term;
            sum+=term;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}