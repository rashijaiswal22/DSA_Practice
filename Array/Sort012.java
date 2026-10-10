package Array;

import java.util.*;

public class Sort012 {
    static void sort012(int[] arr){
        int left = 0, mid =0, right=arr.length -1;
        while(mid <= right){
            if(arr[mid] ==0){
                int temp = arr[left]; 
                arr[left++] = arr[mid];
                arr[mid++] = temp;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right--] = temp;
            }
        }
        
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
        sort012(arr);
        System.out.println("After sorting =");
        for( int i=0; i < size; i++)
        {
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
    
}


