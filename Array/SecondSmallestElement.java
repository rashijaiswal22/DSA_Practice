package Array;

import java.util.*;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int size = sc.nextInt();
        if(size < 2) { return;}
        int arr [] = new int [size];
        System.out.println("Enter elements : ");
        for( int i=0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int sm = Integer.MAX_VALUE;
        int sSm = Integer.MAX_VALUE;
        for(int i =0;i < arr.length;i++){
            if(arr[i] < sm){
                sSm = sm;
                sm = arr[i];
            }
            else if(arr[i] < sSm & arr[i] != sm){
                sSm = arr[i];
            }
        }
        if(sSm == Integer.MAX_VALUE){
            System.out.println("No number found");
        }
        else{
            System.out.println("Second Smallest Number is = "+sSm);
        }
        sc.close();
    }
    
}
