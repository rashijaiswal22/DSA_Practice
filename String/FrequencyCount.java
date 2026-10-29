package String;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        String str = "Programming";
        HashMap<Character, Integer> map = new  HashMap<>();
        for(int i =0;i < str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);

        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" = "+ entry.getValue());
        }


        
    }
    
}
