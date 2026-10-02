package Maths;

import java.util.Scanner;

public class PrimePrint {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n= sc.nextInt();
        for(int i =2; i <=n;i++){
            int c =0;
            for(int j =1;j <=i;j++){
                if(i % j ==0){
                    c++;
                }
                if(c == 2){
                    System.out.println(i+" ");
                }
            }
        }
        sc.close();

    }
}
