package Maths.Recursion;

import java.util.Scanner;

public class FactorialRec {
    static int fact(int n){
        if(n ==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num = ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Ans = "+ans);
        sc.close();
        
    }
    
}
