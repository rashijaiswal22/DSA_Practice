package Array;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        if(size < 2) { return;}
        int arr[] = new int[size];
        System.out.println("Enter elements of array");
        for(int i =0;i < size;i++){
            arr[i] = sc.nextInt();

        }
        int firstLar = Integer.MIN_VALUE;
        int secondLar = Integer.MIN_VALUE;
        for(int i =0;i < arr.length;i++){
            if(arr[i] > firstLar){
                secondLar = firstLar;
                firstLar = arr[i];
            }
            else if (arr[i] > secondLar && arr[i] != firstLar) {
                secondLar = arr[i];                
            }
        }
        if(secondLar == Integer.MIN_VALUE){
            System.out.println("No Second Largest Element exist");
        }
        else{
            System.out.println("Second largest element is = "+secondLar);
        }
        sc.close();
    }
    
}
