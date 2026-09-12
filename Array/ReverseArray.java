package Array;
import java.util.*;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array =");
        for(int i=0; i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
         int[] reversed = new int[arr.length];
         for(int i =0; i < arr.length; i++){
            reversed[i] = arr[arr.length - 1 - i];
         }
         System.out.println("Reversed array = "+ Arrays.toString(reversed));
         sc.close();

    }
}