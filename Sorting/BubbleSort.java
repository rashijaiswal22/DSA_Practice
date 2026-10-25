package Sorting;

import java.util.Scanner;

public class BubbleSort {
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
        for(int i =0;i < arr.length-1;i++){
            boolean swapped = false;

            for(int j =0; j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                    swapped = true;
                }

            }
            if(!swapped)
            break;
        }
        System.out.println("After sorting = ");
        for(int i =0;i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        

    }
    
}
