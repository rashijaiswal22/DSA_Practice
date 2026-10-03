package Maths;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = sc.nextInt();

        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        int lcm =1;
        for(int i=1; ;i++){
            if(i %a==0 && i%b ==0){
                lcm = i;
                break;
            }
        }
        System.out.println("Lcm = "+lcm);
        sc.close();
        
    }
    
}
