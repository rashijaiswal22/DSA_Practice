package Hashing;

import java.util.*;

public class TwoSumCountPair {
    static int getPairsCount(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;

        for(int num : arr){
            int complement = target - num;
            if(map.containsKey(complement)){
                count = count + map.get(complement);
            }
           // map.put(num, map.getOrDefault(num,0)+1);     2nd method
           if(map.containsKey(num)){
            map.put(num, map.get(num) + 1); // if num is present already then set count = 1
           }
           else{
            map.put(num, 1); // if num comes first time, set count = 1
           }
        }
        return count;
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
        int ans = getPairsCount(arr, tar);
        System.out.println("Pairs = "+ans);
        sc.close();
        
    }
    
}
