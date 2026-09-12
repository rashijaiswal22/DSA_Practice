package String;
public class ReverseStr {
    public static void main(String[] args) {
        String s = "Hello";
        String r = "Hello";
        String m = new String("Hello");
        String n = new String("Hello");

        String rev = "";
        for(int i = s.length()-1; i >=0;i--){
            rev = rev+s.charAt(i);

        }
        System.out.println("Reversed String = "+rev);

        if(s == r)        // yes
            System.out.println("yes");
        else
            System.out.println("no");

        if(s == m)      // no
            System.out.println("yes");
        else
            System.out.println("no");
        if(m == n)   // no
            System.out.println("yes");
        else 
            System.out.println("no");
    }
    
}
