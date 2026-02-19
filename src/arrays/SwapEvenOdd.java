package arrays;
import java.util.Scanner;
public class SwapEvenOdd {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ;i <n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("USING APPROACH 1 ");
            SwapArr(arr);
            Printarr(arr);
            System.out.print("USING TWO POINTER");
            TwoPointer(arr);
            Printarr(arr);


        }
    }
    static void Printarr(int[] arr){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
    }
    static int[] SwapArr(int[] arr){
        int j = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return arr;
        }
        for(int i = j +1;i<arr.length;i++){
            if(arr[i] %2 ==0){
                Swap(arr,i,j);
                j++;
            }
        }
        return arr;
    }
    static int[] TwoPointer(int[] arr){
        int j = arr.length - 1;
        int i =0;
        while(i < j){
            if(arr[i] % 2 != 0  && arr[j] == 0){
                Swap(arr,i,j);
                i++;
            }
            else if(arr[i] % 2 == 0){
                i++;
            }
            j--;

        }
        return arr;
    }
    static void Swap(int[] arr, int i , int j ){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
