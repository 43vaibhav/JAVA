package hackerrankprep;
import java.util.Scanner;

public class ArrayRatio {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
            int[] arr =new int[n];
            int cout =0 , cout1= 0 ,  cout2= 0;
            for (int i = 0 ; i< n; i++){
                arr[i]= sc.nextInt();
            }
            for(int i = 0;i<arr.length;i++){
                if(arr[i] > 0){
                    cout++;
                }
                else if(arr[i]<0){
                    cout1++;
                }
                else{
                    cout2++;
                }

            }
            System.out.printf("%.6f\n",(float) cout / n);
            System.out.printf("%.6f\n", (float) cout1/n);
            System.out.printf("%.6f\n",(float) cout2/n);            
           
            

        }
    }
    

}
