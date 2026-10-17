package Array;
import java.util.*;

public class Pair0Sum {

    public ArrayList<ArrayList<Integer>> getPairs0(int arr[]){
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int l =0, r=arr.length-1;
        while(l < r){
            int sum = arr[l] + arr[r];

            if(sum == 0){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[l]);
                pair.add(arr[r]);
                ans.add(pair);

                int lvalue = arr[l];
                int rvalue = arr[r];

                while(l < r && arr[l] == lvalue){
                    l++;
                }
                while(l < r && arr[r] == rvalue){
                    r--;
                }
            }

            else if(sum <0){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        if(size < 2) { return;}
        int arr[] = new int[size];
        System.out.println("Enter elements of array");
        for(int i =0;i < size;i++){
            arr[i] = sc.nextInt();

        }
        Pair0Sum s = new Pair0Sum();
        ArrayList<ArrayList<Integer>> ans = s.getPairs0(arr);
        System.out.println("Pairs with 0 sum = "+ans);
        sc.close();
        
    }
    
}
