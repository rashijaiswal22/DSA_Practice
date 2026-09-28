package Hashing;

import java.util.*;

public class Frequency {
    static void freq1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println("Frequency of Elements = ");

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +"->"+ entry.getValue());

        }       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array =");
        for(int i=0; i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        freq1(arr);

        sc.close();
        
    }
    
}
