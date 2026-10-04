package Maths;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n= sc.nextInt();
        for(int i=1;i <=10;i++){
            int t =n*i;
            System.out.println(n+" * "+i+ " = "+t);
        }
        sc.close();
        
}
    
}
