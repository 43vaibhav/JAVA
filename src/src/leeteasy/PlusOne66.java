package leeteasy;
import java.util.*;
public class PlusOne66 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n  = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("ENTER THE ARRAY:");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int ans[] = Increment(arr);
            PrintArray(ans);
        }
    }
    static void PrintArray(int arr[]){
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
    }
    static int[] Increment(int [] arr){
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i< arr.length;i++){
            list.add(arr[i]);
        }
        int i = list.size() - 1;
        while(i >= 0){
            if(list.get(i) < 9){
                list.set(i,list.get(i) + 1);
                break;
            }
            else{
                list.set(i,0);
                i--;
            }
        }
        if(i < 0){
            list.add(0,1);
        }
        int result[] = new int[list.size()];
        for(int j = 0;j<result.length;j++){
            result[j] = list.get(j);
        }
        return result;


    }
   

}
