package leetmed;
import java.util.Scanner;
public class ZeroFilledSubarray {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println("ENTER THE ARRAY:");
            int arr[] = new int[n];

            for(int i = 0;i<n;i++){
                arr[i]= sc.nextInt();

            }
            checkZeroes(arr);
        }
    }
    static int checkZeroes(int arr[]){
        int count = 0;
        int j = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                count++;
                if(j == -1){
                    j = i;
                }
            }
        }
        if(j == -1){
            return count;
        }
        
        // 1 3 0 0 2 0 0 4
        for(int i = j;i< arr.length;i++){
           if(arr[i] == 0){
            
           }
        }
        return count;
    }
}
