package arrays;
import java.util.Scanner;
public class CheckRepeats {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(checkRepeats(arr));
        }
    }
    public static int checkRepeats(int arr[]){
        int ans = 0;
        for(int i = 0;i<arr.length;i++) {
            for(int j = i +1;j<arr.length;j++){
                if(arr[i] == arr[j] ){
                    ans= arr[i];
                    return ans;
                }
                else{
                   ans = -1;
                }
            }
        }
            return ans;
    }
        
}

