package sorting;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE ARRAY SIZE:");
            int n =  sc.nextInt();
            int arr[] = new int[n];
            System.out.println("ENTER THE ARRAY:");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println();
            for(int i = 0;i<n - 1;i++){
                
                int k = i;
                int count = 0;
                for(int j = i+1;j<n;j++){
                   if(arr[j] < arr[k]){
                    k = j;
                   
                    count++;
                   }
                }
                if( k != i){
                    Swap(arr,i,k);
                }
                
               
            }
            System.out.println();
            System.out.println("SORTED ARRAY ANS: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+ " "); 

            }
            System.out.println();
            

        }
    }
    static void Swap(int arr[] , int i, int k){
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }
    /* SPACE COMPLEXITY = O(1)
     * TIME COMPLEXITY = O(NSQUARE)
     *  FOR ALL CASES
     * UNSTABLE 
     */
    
}
