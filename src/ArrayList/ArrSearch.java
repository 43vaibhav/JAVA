package arrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrSearch {
    /* GIVEN AN ARRAY OF N INTEGERS AND A TAREGT ELEMENT PRINT WHETHER THAT ELEMENT EXISTS IN THE ARRAY OR NOT */
    /*ALSO SEARCHING FOR IF AN ELEMENET IS PRESENT IN AN ELEMENT RETURN ITS INDEX  using arraylist */
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
        /*CREATING AN ANS ARRAYLIST TO PUSH INDEX ADN IF BASE CASE IS TRUE RETURN IT 
         */
        if(i == arr.length){
            return ans;
        }
        /*CREATIG NEW ARRALSIT TO ADD ELEMENTS OTHER THAN BASE CASE */
        ArrayList<Integer> rest = IdxSearch(arr, i+1, x);
         // If current element matches, add its index
        if(arr[i] == x) {
            ans.add(i);
        }
        // Add all indices found in the rest of the array IN REST ARRAYLIST TO ANS ARRAYLIST

        ans.addAll(rest);
        
        return ans ;

    }
}
