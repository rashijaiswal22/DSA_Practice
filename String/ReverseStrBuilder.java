package String;

public class ReverseStrBuilder {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder rev = new StringBuilder(str);
        rev.reverse().toString();
        System.out.println(rev);
    }
    
}
