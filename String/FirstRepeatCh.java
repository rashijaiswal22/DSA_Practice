package String;
import java.util.*;

public class FirstRepeatCh {
    public static void main(String[] args) {
        String s = "Programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) > 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("Not found");

        }
    
}


