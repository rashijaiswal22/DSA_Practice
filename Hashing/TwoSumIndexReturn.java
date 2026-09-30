package Hashing;

import java.util.*;

public class TwoSumIndexReturn {
    static int[] twoSumIn(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i < arr.length;i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
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
        int[] a= twoSumIn(arr, tar);
        if(a.length == 2){
            System.out.println("Indecs are = [ "+ a[0] + " , " +a[1]+ "]");
            System.out.println("Numbers are = [ "+arr[0] + " and " + arr[a[1]]);
        }
        else{
            System.out.println("nothing found");
        }
        sc.close();
    }
    
}
