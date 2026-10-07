package Maths.Recursion;

import java.util.Scanner;

public class FibonacciRec {
    static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n ==1){
            return 1;
        }
        return fibo(n-1) + (n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num = ");
        int n = sc.nextInt();  
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
        sc.close();
    }
    
}

