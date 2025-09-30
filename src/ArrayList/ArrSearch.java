package arrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();
        System.out.println("ENTER THE ELEMENT TO SEARCH INSIDE ARRAY:");
        int element = sc.nextInt();
        System.out.println("ENTER THE ARRAY: ");
        int arr[] = new int[n];
        for(int i = 0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
/* GIVEN THE ARRAY IF THERE ARE MULTIPLE INDICES WITH TARGET ELEMENT PRINT THE INDICES */
        System.out.println("INDICES WITH TARGET ELEMENT IN THE ARRAY: ");
       ArrayList<Integer> result = IdxSearch(arr,0,element);
       System.out.println(result);
        
        
    } 

    static ArrayList<Integer> IdxSearch(int arr[], int i, int x){
        ArrayList<Integer> ans = new ArrayList<>();
        if(i == arr.length){
            return ans;
        }
        ArrayList<Integer> rest = IdxSearch(arr, i+1, x);
         // If current element matches, add its index
        if(arr[i] == x) {
            ans.add(i);
        }
        // Add all indices found in the rest of the array
        ans.addAll(rest);
        
        return ans ;

    }
}
