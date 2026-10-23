package Searching;

import java.util.Scanner;
//    TC => Best case = O(1),    TC Avg,Worst = O(log n),     SC => O(1)
public class BinarySearch {
    static int binarySearch(int arr[], int target){
        int left =0, right =arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right= mid - 1;
            }
        }
        return -1;
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
        System.out.println("Enter search num = ");
        int s = sc.nextInt();
        int ans = binarySearch(arr, s);
        if(ans != -1){
            System.out.println("Element found at index = "+ans);
        }
        else{
            System.out.println("Not found");
        }
        
        sc.close();        
    }
    
}
