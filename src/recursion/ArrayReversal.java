package recursion;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayReversal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
        int n = sc.nextInt();
        System.out.println("ENTER THE ARRAY: ");
        int arr[] = new int[n];
        for(int i  = 0 ; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int arrCopy1[] = Arrays.copyOf(arr, arr.length);
        int arrCopy2[] = Arrays.copyOf(arr, arr.length);
        int arrCopy3[] = Arrays.copyOf(arr, arr.length);

        System.out.println("USING REVERSAL PRINTING: ");
        printArr(arrCopy3, n -1 );

        System.out.println();
        System.out.println("USING TWO POINTERS:");
        int ans[] = ArrayRev(arrCopy1,0,n-1);
        for(int i = 0;i<arr.length;i++){
            System.out.print(ans[i]+ " ");
        }

        System.out.println();
        System.out.println("ARRAY :");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        System.out.println("USING ONE POINTER:");
        int ans1[] = ArrayRevOnePointer(arrCopy2,0);
        for(int i = 0;i<arr.length;i++){
            System.out.print(ans1[i]+ " ");
        }
        

    }
    static void printArr(int arr[], int i){
        if(i<0){
            return;
        }
        System.out.print(arr[i]+ " ");

        printArr(arr,i-1);
    }
    static int[] ArrayRev(int arr[],int l, int r){
        if(l>=r){
            return arr;
        }
        Swap(arr,l,r);
        
        return ArrayRev(arr,l+1,r-1);
       
    }
    static int[] ArrayRevOnePointer(int arr[], int i){
        int n = arr.length;
        if(i>=n/2){
            return arr;
        }
        Swap(arr,i,n-i-1);
        ArrayRevOnePointer(arr,i+1);
        return arr;

    }
    static void Swap(int arr[], int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
