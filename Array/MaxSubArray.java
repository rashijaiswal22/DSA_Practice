package Array;

import java.util.*;

public class MaxSubArray {
    static int subarrayMax(int arr[]){
        int ans = arr[0];
        int maxEnd = arr[0];
        for(int i =1;i < arr.length;i++){
            maxEnd = Math.max(maxEnd+arr[i], arr[i]);
            ans = Math.max(ans, maxEnd);

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
        System.out.println("Ans = "+ans);
        sc.close();
    }
    
}
