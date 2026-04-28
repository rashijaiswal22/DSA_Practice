package Hashing;

import java.util.*;

public class FirstRepeatingElement {
    static int firRep(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return -1;
    }
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
        int ans = firRep(arr);
        System.out.println("First Repeating Element is +"+ ans);
        sc.close();
        
    }
    
}
