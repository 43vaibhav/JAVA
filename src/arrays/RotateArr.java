package arrays;
import java.util.Scanner;
public class RotateArr {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the array size");
            int n= sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array:");
            for(int i = 0;i< n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter k value:");
            int k =sc.nextInt();
            k = k % n;
            
            System.out.println("Using a new array:");
            rotateArr(arr, k,n);
            System.out.println();
            System.out.println("Rotating using in-place array:");
            ReverseArray(arr , k,n);
        }
    }

    public static void rotateArr(int[] arr , int k, int n ) {
       
        int[] temp = new int[n];
        int j = 0 ;
        for(int i = n - k;i< n;i++){
            temp[j++] = arr[i];
        }
        for(int i= 0;i< n- k ;i++){
            temp[j++] = arr[i];
        }
        for(int num =0;num< temp.length;num++){
            System.out.print(temp[num]  + "  ");
        }
    }
    public static void ReverseArray(int[] arr, int k ,int n){
        int i = n -k;
        int j = n -1;
        while(i <= j){
            Swap(arr,i ,j);
            i++;
            j--;
        }
        int a = 0;
        while(a <= j -1){
            Swap(arr,i,j);
            a++;
            j--;
        }
        for(int p = 0;p <arr.length;p++){
            for(int q = n-1;q>i;q--){
                Swap(arr, p , q);
               System.out.print(arr[p]);
            }
        }

    }
    static void Swap(int arr[], int i , int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    

}
