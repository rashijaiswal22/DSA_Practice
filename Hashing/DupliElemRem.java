package Hashing;
import java.util.*;

// TC=> O(n), SC => O(n)
public class DupliElemRem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);          
        }
        System.out.println("After Removal = ");
        for(int i =0; i < arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

    }    
}


