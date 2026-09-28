package Hashing;

import java.util.*;
// TC = O(n), negative & duplicate handled
public class TwoSumCheck {
    static boolean isTwoSum(int arr[], int target){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i < arr.length; i++){
            int complement = target - arr[i];

            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
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
        boolean ans = isTwoSum(arr, tar);
        if(ans)
            System.out.println("Yes, It is Two sum, pair exist");
        else
            System.out.println("No pair exist, It is not Two Sum");
        sc.close();
    }
    
}
