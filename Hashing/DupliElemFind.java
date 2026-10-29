package Hashing;
import java.util.*;

// TC=O(n), SC = O(n)
public class DupliElemFind {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println(num);
            }
        } 
        System.out.println("After =" );
        for (int i =0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }     


    }
    
}
