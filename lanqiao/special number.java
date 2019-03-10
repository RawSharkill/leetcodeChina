

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int a=i%1000/100;
            int b=i%100/10;
            int c=i%10;
            if(i==(a*a*a+b*b*b+c*c*c))
                System.out.println(i);
        }
    }
}