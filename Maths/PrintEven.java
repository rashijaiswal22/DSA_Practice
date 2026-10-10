package Maths;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i =0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Even elements = ");
        for(int i =0; i < n;i++){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i]+" ");

            }
        }
        sc.close();
        
    }
    
}
