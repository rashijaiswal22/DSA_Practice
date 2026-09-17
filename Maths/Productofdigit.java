package Maths;

import java.util.*;

public class Productofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number =");
        int n = sc.nextInt();
        int m =1;
        int t = n;
        while(t != 0){
            int a = t%10;
            t = t/10;
            m *= a;
        }
        System.out.println("Product of Digits = "+m);
        sc.close();
    }
    
}
