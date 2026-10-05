package Maths;

import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num = ");
        int n = sc.nextInt(); 
        int s = n*(n+1)/2;
        System.out.println("Sum ="+s);
        sc.close();
    }
    
}
