package Array;

import java.util.*;

public class MissingNumber {
    static int missNum(int arr[]){
        long n = arr.length +1;
        long sum =0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        long exSum = n*(n+1)/2;
        return (int)(exSum - sum);        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int size = sc.nextInt();
        int arr [] = new int [size];
        System.out.println("Enter elements : ");
        for( int i=0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = missNum(arr);
        System.out.println("Missing element = "+ans);
        sc.close();
        
    }
    
}
