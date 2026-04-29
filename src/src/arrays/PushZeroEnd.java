package arrays;
import java.util.Scanner;

public class PushZeroEnd {
    public static void main(String args[] ){
        try(Scanner sc= new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("ENYTER THE ARRAY: ");
            for(int i = 0 ;i < n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("ANSWER IS :");
            pushZeroesToEnd(arr);
        
        }
    }
    
//     /*Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0] */
    static void pushZeroesToEnd(int[] arr){
        int j = 0; // j will point at only the zero th element in array if there is one
        for(int i =0;i<arr.length;i++){ // searchingfor a zero in the array 
            if(arr[i] == 0){ // we got the first zero and now we need to break the loop
                j = i;  // j points to the zero in the loop
                break;
            }
        }
        for(int i = j + 1; i< arr.length;i++){ // iterating i from 0 to n-1 so it will check whether there are non zeroes number ahead
            if(arr[i] != 0){
                Swap(arr,i,j);
                j++;
            }
            
        }
        for(int k = 0;k< arr.length;k++){
            System.out.print(arr[k] + " ");
        }
        
    }
    static void Swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        
    }
}
    