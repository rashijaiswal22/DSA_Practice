package Maths;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int t =n;
        int c =0;
        while (t != 0) {
            c++;
            t = t / 10;            
        }
        int s =0;
        t =n;

        while(t !=0){
            int a = t % 10;
            t = t / 10;
            s = s+(int)Math.pow(a, c);
        }
        if(s == n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
        sc.close();

    }
    
}
