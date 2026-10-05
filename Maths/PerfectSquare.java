package Maths;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num = ");
        int n = sc.nextInt(); 
        int root = (int) Math.sqrt(n);
        if(root * root == n){
            System.out.println("Number is perfect square");
        }
        else{
            System.out.println("Number is not perfect square");
        }
        sc.close();
        
    }
    
}
