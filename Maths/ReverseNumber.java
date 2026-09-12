package Maths;
import java.util.*;

// TC= O(log n), SC=O(1)
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int t = n;
        int rev = 0;

        while(t != 0){
            int a = t %10;   // 1234 % 10 =4  , 123 % 10 = 3   , 12 % 10= 2   , 1%10 = 1
            t = t /10;       // 1234 / 10 =123 , 123 / 10= 12  , 12 / 10= 1   , 1/10 = 0
            rev = rev*10+a;  // 0*10+4 = 4    ,  4*10+3 = 43   , 43*10+2=432  , 432*10+1 = 4321
        }
        System.out.println("Reversed = "+rev);
        sc.close();
        
    }
    
}
