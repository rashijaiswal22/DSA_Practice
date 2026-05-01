package Array;
import java.util.*;

public class MoveZeroeEnd {
    static void pushZeroes(int arr[]){
        int count =0;
        for(int i =0;i < arr.length;i++){
            if(arr[i] != 0){
                int t = arr[i];
                arr[i] = arr[count];
                arr[count] = t;

                count++;
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
        pushZeroes(arr);
        System.out.println("Array after Removing Zeroes : ");
        for(int i =0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
        sc.close();
        
    }

    
}
