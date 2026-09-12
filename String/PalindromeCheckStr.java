package String;

import java.util.*;

public class PalindromeCheckStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String s = sc.nextLine();

        boolean isPalindrome = true;
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                isPalindrome = false;
                break;
            } 
            left++;
            right--;           
        }
        if(isPalindrome){
            System.out.println("Yes Plindrome");

        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
    
}
