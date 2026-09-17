package Array;

import java.util.*;

public class PalindromeCheckArray {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array =");
        for(int i=0; i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int left =0, right=arr.length-1;
        boolean isPlaindrome = true;
        while(left < right){
            if(arr[left]!= arr[right]){
                isPlaindrome=false;
                break;
            }
            left++;
            right--;

        }
        if(isPlaindrome){
            System.out.println("Array is Plaindrome");
        }
        else{
            System.out.println("Array is not Palindrome");
        }
        sc.close();
}
    
}
