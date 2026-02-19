package arrays;
import java.util.Scanner;

public class RangeSUm {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();//5
            int arr[] = new int[n];// 2 4 1 3 6
            System.out.println("ENTER THE ARRAY:");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter number of queries:");
            int q = sc.nextInt();
            while(q-- > 0 ){
                System.out.println("Enter range:");
                int l = sc.nextInt();//1
                int r = sc.nextInt();//3
                System.out.println( "SUM: "+ FindSum(arr,l,r));
            }
            
            
        }
    }
    static int FindSum(int arr[],int l, int r){
        int pref[]= callPrefixSum(arr);
        if(l == 1){
            return pref[r - 1];
        }
        else{
            return pref[r - 1] - pref[l - 2];
        }
        
        
    }
    static int[] callPrefixSum(int arr[]){
        for(int i =1;i< arr.length;i++){
            int temp = arr[i];
            int sum  =arr[i -1] + temp;
            arr[i] = sum;
        }
        return arr;
    }

}
