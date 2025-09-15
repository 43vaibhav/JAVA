package dorting;
import java.util.Scanner;
=public class iNSERTIONSort {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("ENTER THE ARRAY SIZE:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("ENTER THE ARRAY:");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println();
            InsertionSort(arr,n);
            System.out.println();
            System.out.println("OPTIMISED SORTING:");
            OptimisedMethod(arr,n);
            
        }
    }
    static void InsertionSort(int arr[], int n){
        for(int i=1;i<n;i++){
            for(int j = i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    Swap(arr,i,j);
                    i--;
                }
            }
        }
        System.out.println("Print Sorted Array:");
        for(int num: arr){
            System.out.print(num+" ");
        }
        
    }
    static void OptimisedMethod(int arr[],int n){
        for(int i = 1;i<n;i++){
            int j = i;
            while(j<0 && arr[j]>arr[j-1]){
                Swap(arr,j,j-1);
            }
        }
        for(int num: arr){
            System.out.print(num + " ");
        } 
    }
    static void Swap(int arr[], int i,int j){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i] = temp;
    }
}
/*SPACE COMPLEXITY = O(1)
 * TIME COMPLEXITY O(N SQUARE> FOR WORST AND AVERAGE CASE
 * AND O(N) FOR BEST CASE
 * STABLE ALGO 
 */
