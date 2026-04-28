package Hashing;

import java.util.*;

public class FirstNonRepeatingElement {
    public static int FirNonRep(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int num : arr){
            if(map.get(num) == 1){
                return num;
            }
        } 
        return -1;   

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        if(size < 1) { return;}
        int arr[] = new int[size];
        System.out.println("Enter elements of array");
        for(int i =0;i < size;i++){
            arr[i] = sc.nextInt();

        }
        int ans = FirNonRep(arr);
        System.out.println("First Repeating Element is +"+ ans);
        sc.close();
    }
    
}
