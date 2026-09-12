package String;
import java.util.*;

public class ReverseStrTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        int left =0;
        int right = ch.length - 1;
        
        while(left < right){
            char t = ch[left];
            ch[left] = ch[right];
            ch[right] = t;

            left++;
            right--;
        }

        System.out.println("Reversed string = "+new String(ch));
        sc.close();                   // char[] -> string
    }
    
}
