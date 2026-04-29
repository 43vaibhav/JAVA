package arrays;
import java.util.Scanner;
public class CheckSum {
    /*
     * CHECK WHETHER A GIVEN ARRAY HAS SUBPART AS EQUAL SUFFIX SUMA ND PREFIX SUM 
     * EG : ARRAY IS 5 3 2 6 3 1 
     * THEN 5 + 3 +2 = 10 ALSO 6 + 3 +1 = 10 HENCE IT RETURNS TRUE
     */
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n] ;

            System.out.println("ENTER THE ARRAY: ");
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            int pref1[]= PrefixSum(arr);
            System.out.println("\nPREFIX SUM: ");
            for(int i = 0;i<n;i++){
               System.out.print(pref1[i] + " ") ;
            }
            
            int suff1[] = SuffixSum(arr);
            System.out.println("\nSUFFIX SUM: ");
            for(int i = 0;i<n;i++){
               System.out.print(suff1[i] + " ") ;
            }
            boolean result = checkBothSum(pref1, suff1);
            System.out.println("\n" +result);

            System.out.println("OPTIMISED METHOD");
            System.out.println(checkTotalSum(arr));

        }
    }
    private static boolean checkTotalSum(int arr[]) {
        int totalsUM = FINDaRRAYsUM(arr);
        int prefSum = 0;
        for(int i  =0;i<arr.length;i++){
            prefSum += arr[i];
            int SuffSum = totalsUM - prefSum;
            if(SuffSum == prefSum){
                return true;
            }
        }
        return false;
    }
    private static int FINDaRRAYsUM(int[] arr) {
        int total= 0;
        for(int i: arr){
            total += i;
        }
        return total;
    }

    static int[] PrefixSum(int arr[] ){
        int i = 1;
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        while(i < arr.length){
            pref[i] = pref[i -1]  + arr[i];
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
