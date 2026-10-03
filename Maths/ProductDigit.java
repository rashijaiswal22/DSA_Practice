package Maths;

import java.util.Scanner;

public class ProductDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int m =1;
        while(n !=0){
            int a = n % 10;
            n = n / 10;
            m = m*a;
        }
        System.out.println("Ans = "+m);
        sc.close();
    }
    
}
