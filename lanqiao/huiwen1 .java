

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for(int i=1000;i<=9999;i++){
            int a=i%10000/1000;
            int b=i%1000/100;
            int c=i%100/10;
            int d=i%10;
            if(a==d && b==c)
                System.out.println(i);
        }
    }
}