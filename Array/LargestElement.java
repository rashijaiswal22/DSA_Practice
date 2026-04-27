package Array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        if(size < 2) { return;}
        int arr[] = new int[size];
        for(int i =0;i < size;i++){
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for(int i =0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element = "+max);
        sc.close();
    }
    
}
