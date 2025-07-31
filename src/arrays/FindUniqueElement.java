package arrays;
import java.util.Scanner;
public class FindUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i = 0;i< n ;i++) {
            arr[i] =sc.nextInt();
        }
        // Arrays.sort(arr);
        // int i= 0;
        // while(i <arr.length-1) {
        //     if(arr[i]==arr[i+1]){
        //         i+=2;   
        //     }           
        //     else{
        //         System.out.println(arr[i]);
        //         return;
        //     }
        // }
        // if(i == n -1){
        //     System.out.println(arr[i]);
        // }
       
        for(int i = 0; i< arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }

        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != -1){
                System.out.println(arr[i]);
                return;
            }
        }
        
    
    }
}

