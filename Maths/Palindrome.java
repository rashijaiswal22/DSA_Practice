package Maths;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int t = n;
        int rev = 0;

        while(t != 0){
            int a = t %10;
            t = t / 10;
            rev = rev*10+a;
        }
        if(n == rev){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
    
}
