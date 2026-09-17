package Maths;

import java.util.*;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int s =0;
        int t = n;
        while(t  != 0){
            int a = t%10;
            t = t/10;
            s+=a;
        }
        System.out.println("Sum of Digits = "+s);
        sc.close();

    }
    
}
