package Array;
import java.util.*;

public class SmallestElement {
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
        int min = arr[0];
        for(int i =0;i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element = "+min);
        sc.close();
    }
    
}
