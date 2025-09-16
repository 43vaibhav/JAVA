package sorting;
import java.util.Scanner;
public class bubbleSort {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("ENTER THE ARRAY SIZE:");int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("ENTER THE ARRAY:");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println();
            
            for(int i  =0 ;i<n-1;i++){
                int count = 0;
                for(int j = 0;j<n-i-1;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        count++;
                        
                    }
                    
                }
                System.out.println(count);
                if(count==0){
                    break;
                }
                
            }
            System.out.print("\nSORTED ARRAY: ");
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print( arr[i] + " " );
            }
            
        }
        /*SPACE COMPLEXITY = O (1)
         * TIME COMPLEXITY = 
         * WORST CASE = O(NSQUARE) WHEN ARRAY IS REVESED
         * BEST CASE(N WHEN SORTED + OPTIMISED)
         * AVERAGE CASE O(NSQUARE)4
         * STABLE SORT
         * ''
        */
    }
}
