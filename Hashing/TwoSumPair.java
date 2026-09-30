package Hashing;
import java.util.*;

public class TwoSumPair {
    static int[] ReturnPair(int arr[], int target){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            int comp = target - num;
            if(set.contains(comp)){
                return new int[]{comp, num};
            }
            set.add(num);
        }
        return new int[]{};
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
        System.out.println("Enter target = ");
        int tar = sc.nextInt();
        int[] ans = ReturnPair(arr, tar);
        System.out.println("Pair = "+ ans);
        sc.close();        
    }
    
}
