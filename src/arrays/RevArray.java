package arrays;
import java.util.Scanner;
public class RevArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("ENTER ARRAY SIZE:");
            int n = sc.nextInt();
            System.out.println("ENTER THE ARRAY:");
            int[] arr = new int[n];
            for(int i = 0;i <n;i++){
                arr[i] = sc.nextInt() ;
            }
            System.out.println("ONLY for printing reversal of array");
            ReverseArray(arr);
            System.out.println();
            System.out.println("using an new array");
            ReverseArr(arr);
            System.out.println();
            System.out.println("using swapping");
            SwapArr(arr);
            System.out.println();
           

        }
    }
    static void ReverseArr(int arr[]){
        int[] ans = new int[arr.length];
        for(int i = 0;i<ans.length;i++){
            ans[i] = arr[arr.length - 1 - i];
        }
        
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] + "  ");
        }
    }
    public static void SwapArr(int arr[]){
        int i = 0;
        int j =arr.length - 1;
        while(i  <   j){
            Swap(arr,i,j);
            i++;
            j--;
        }
        for(int k =0;k<arr.length;k++){
            System.out.print(arr[k] + "  ");
        }
        
    }
    static void ReverseArray(int arr[]){
        for(int i = arr.length - 1; i >=0;i--){
            System.out.print(arr[i] + "  ");
        }
    }

    public static void Swap(int[] arr,int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
}

