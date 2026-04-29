package hackerrankprep;
import java.util.Arrays;
import java.util.Scanner;
public class LonelyInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int[] arr = new int[n] ;
        for(int i = 0 ;i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        boolean flag = false;
        for(int  i = 0; i< n - 1; i++){
            if(arr[i] == arr[i +1]){
                i++;
            }
            else{
                flag = true;
                System.out.print(arr[i]);
                break;
            }
        }
        if(flag == false){
            System.out.println(arr[n - 1]);
        }   
        sc.close();
    }
}
