package hackerrankprep;
import java.util.Scanner;
public class plusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int pos =0;
        int neg =0;
        int zero =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <0){
                neg++;
            }
            else if(arr[i]==0){
                zero++;
            }
            else{
                pos++;
            }
           
        }
       
        double pos1= (double) pos / (arr.length);
        double neg1 = (double) neg / (arr.length);
        double zero1 = (double) zero / (arr.length);
        System.out.printf("%.6f",pos1);
        System.out.println();
        System.out.printf("%.6f",neg1);
        System.out.println();
        System.out.printf("%.6f",zero1);
        System.out.println();


    }
    
}
