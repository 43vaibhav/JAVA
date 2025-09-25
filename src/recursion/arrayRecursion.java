package recursion;
import java.util.Scanner;
public class arrayRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ARRAY: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        /* PRINT THE MAXIMUM ELEMENT OF THE ARRAY USING RECUSRION */
        System.out.println("MAXIMUM ELEMENT OF THE ARRAY : ");
        int max = Integer.MIN_VALUE;
        System.out.println(maxArr(arr,0,max));
      

    }
    static int maxArr(int arr[], int i,int max){
        if(i== arr.length){
        return max;
    }
    if(arr[i]>max){
        max = arr[i];
    }
     return maxArr(arr, i+1, max);
    

    }
    
}
