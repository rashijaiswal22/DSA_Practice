package Array;

import java.util.*;
// KADANE'S ALGORITHM

public class MaxSubArray {
    static int subarrayMax(int arr[]){
        int ans = arr[0];
        int maxSum = arr[0];
        for(int i =1;i < arr.length;i++){
            maxSum = Math.max(maxSum+arr[i], arr[i]);
            ans = Math.max(ans, maxSum);

        }
        return ans;
    }
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
        int ans = subarrayMax(arr);
        System.out.println("Answer = "+ans);
        sc.close();
    }
    
}




