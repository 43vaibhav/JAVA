package recursion;
import java.util.Scanner;
public class arrSearch {
    
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
        /* GIVEN AN ARRAY OF N INTEGERS AND A TAREGT ELEMENT PRINT WHETHER THAT ELEMENT EXISTS IN THE ARRAY OR NOT */
    /*ALSO SEARCHING FOR IF AN ELEMENET IS PRESENT IN AN ELEMENT RETURN ITS INDEX ELSE  -1 */
        System.out.println("THE ELEMENT IS INSIDE THE ARRAY: ");
        System.out.println(elementIdx(arr,0,element) >= 0 ? "YES" : "NO");
/* GIVEN THE ARRAY IF THERE ARE MULTIPLE INDICES WITH TARGET ELEMENT PRINT THE INDICES */
        System.out.println("INDICES WITH TARGET ELEMENT IN THE ARRAY: ");
        IdxSearch(arr,0,element);
    } 

    static void IdxSearch(int arr[], int i, int x){
        if(i == arr.length){
            
            return ;
        }
        if(arr[i] == x) {
            System.out.print(i + " ");
        }
        IdxSearch(arr, i+1, x);
        return ;

    }
    static int elementIdx(int arr[], int i, int x){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == x) {
            return i;
        }
        return elementIdx(arr, i+1, x);

    }
}
