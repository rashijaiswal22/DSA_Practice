package Array;
import java.util.*;

public class MinSubArray {
    static int subarrayMin(int arr[]){
        int ans = arr[0];
        int minSum = arr[0];
        for(int i =1;i < arr.length;i++){
            minSum = Math.min(arr[i], minSum+arr[i]);
            ans = Math.min(ans,minSum);
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
        int ans = subarrayMin(arr);
        System.out.println("Answer = "+ ans);
        sc.close();
        
    }
}
