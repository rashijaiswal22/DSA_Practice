package String;
import java.util.*;

// LL preserves insertion order TC= O(n),  SC=> O(k)
public class FirstNonRepeatingCh {
    public static void main(String[] args) {
        String s = "Programming";
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0; i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        } 
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                return;
            }
        }
        System.out.println("No exist");
        
    }
    
}
