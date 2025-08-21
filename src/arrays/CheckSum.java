package arrays;
import java.util.Scanner;
public class CheckSum {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n] ;
            System.out.println("ENTER THE ARRAY: ");
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int pref1[]= PrefixSum(arr);
            int suff1[] = SuffixSum(arr);
           
            boolean result = checkBothSum(pref1, suff1);
            System.out.print(result);
        }

    }
    static int[] PrefixSum(int arr[] ){
        int i = 1;
        int pref[] = new int[arr.length];
        pref[0 ] = arr[0];
        while(i < arr.length){
            pref[i] = pref[i - 1]+ arr[i];
            i++;
        }
        return pref;
    }
    static int[] SuffixSum(int arr[] ){
        int i = arr.length - 2;
        int suff[] = new int[arr.length];
        suff[arr.length - 1] = arr[arr.length - 1];
        while(i >= 0){
            suff[i] = suff[i + 1]+ arr[i];
            i--;
        }
        return suff;
    }
    static boolean checkBothSum(int pref1[], int suff1[]){
        
        for(int i = 0;i<pref1.length-1;i++){    
            if(pref1[i] == suff1[i + 1]){
                return true;
            }
        }
        return false;

    }


}
