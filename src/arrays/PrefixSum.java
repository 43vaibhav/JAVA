package arrays;
import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("INPUT ARRAY:");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int[] prefix = callPrefix(arr);
            System.out.println("PREFIX SUM Using NEW aARRAY:");
            PrintArray(prefix);
            System.out.println();
            System.out.println("PREFIX SUM IN ARRAY:");
            int pref1[] = callPrefixSum(arr);
            PrintArray(pref1);
        }
    }
    static int[] callPrefix(int arr[]){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    static int[] callPrefixSum(int arr[]){
        for(int i =1;i< arr.length;i++){
            int temp = arr[i];
            int sum  =arr[i -1] + temp;
            arr[i] = sum;
        }
        return arr;
    }
    static void PrintArray(int arr[]){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        
        
    }

}
