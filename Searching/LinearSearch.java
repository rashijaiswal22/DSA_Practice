package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int size = sc.nextInt();
        int arr [] = new int [size];
        System.out.println("Enter elements : ");
        for( int i=0; i < size; i++)
        {
              arr[i] = sc.nextInt();
        }
        System.out.println("Enter serch num = ");
        int s = sc.nextInt();

        boolean found = false;
        for(int i =0; i < arr.length;i++){
            if(arr[i] == s){
                System.out.println("Number is found at = "+ i + " index");
                found = true;
                break;
            }
            
        }
        if(!found)
                System.out.println("Not found");
        sc.close();
    }
    
}
