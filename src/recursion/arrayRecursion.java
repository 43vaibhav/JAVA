package recursion;
import java.util.Scanner;
public class arrayRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n  = sc.nextInt();
        if(n == 0){
            System.out.println("EMPTY ARRAY");
        }
        
        else {
            int arr[] = new int[n];
            System.out.println("ENTER THE ARRAY: ");
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            sc.close();
            /* PRINT THE MAXIMUM ELEMENT OF THE ARRAY USING RECUSRION */
            System.out.println("MAXIMUM ELEMENT OF THE ARRAY USING PARAMETERS : ");
            int max = Integer.MIN_VALUE;
            System.out.println(maxArr(arr,0,max));

            System.out.println("MAXIMUM ELEMENT WITHOUT USING PARAMETERS: ");
            System.out.println(maxElement(arr,0));
            
            System.out.println("OPTIMIZED APPROACH:");
            System.out.println(largestElement(arr,0));

        }
        
    }
    static int largestElement(int arr[] , int i){
        if(i == arr.length-1){
            return arr[i];
        }
        int max = largestElement(arr,i+1);
        return Math.max(max,arr[i]);
    }
    static int maxArr(int arr[], int i,int max){
        if(i == arr.length){
            return max;
        }
        if(arr[i]> max) max = arr[i];
        return maxArr(arr,i +1 ,max);

    }
    static int maxElement(int arr[], int i){
        int max = arr[i];
        if(i == arr.length -1) {
            return max;
        }
        // if(max < arr[i] )max = arr[i];
        return Math.max(maxElement(arr, i+1),max);
    }
    
}
