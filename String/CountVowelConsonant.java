package String;

import java.util.*;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String s = sc.nextLine();
        s= s.toLowerCase();
        int vowel =0;
        int cons=0;
        int digit=0, c=0;
        
        for(int i =0; i < s.length();i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch<='z'){
                if(ch == 'a' || ch =='e' || ch =='i' || ch == 'o' || ch =='u'){
                    vowel++;
                }
                else{
                    cons++;
                }
            }
            else if(ch>='0'&& ch <='9') {
                digit++;
            }
            else{
                c++;
            }
        }
        System.out.println("Vowel & Consonants = "+vowel +","+ cons);
        System.out.println("Digit ="+digit);
        System.out.println("Character = "+c);
        sc.close();
        
    }
    
}
