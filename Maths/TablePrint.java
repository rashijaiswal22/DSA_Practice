package Maths;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n= sc.nextInt();
        int sum = 1;
        for(int i =2; i*i <=n;i++){
            if(n % i ==0){
                sum+=i;

            }
            if(i*i !=n){
                sum+= n / i;
            }

        }
        if(n == sum){
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
        sc.close();
    
}
    
}
