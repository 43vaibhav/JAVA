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
            RotateInPlace(arr , k,n);
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
    public static void RotateInPlace(int[] arr, int k ,int n){
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int a =0;a<arr.length;a++){
            System.out.print(arr[a] + "  ");
        }
    }
    static void reverse(int[] arr, int i,int j){
        while(i< j){
            Swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void Swap(int arr[], int i , int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    

}
