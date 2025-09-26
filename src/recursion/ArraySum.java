package recursion;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();
        System.out.println("ENTER THE ARRAY: ");
        int arr[] = new int[n];
        for(int i = 0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("SUM USING PARAMETERS:");
        int sum = 0;
        System.out.println(usingPara(arr,0,sum));

        System.out.println("SUM USING FUNCTION:");
        System.out.println(usingFunc(arr,0));
        sc.close();
    }
    static int usingPara(int arr[], int i, int sum){
        if(i == arr.length - 1 ){
            return arr[i];
        }
        sum = arr[i] +  usingPara(arr, i+1, sum);
        return sum;
    }
    static int usingFunc(int arr[], int i){
        if(i == arr.length - 1 ){
            return arr[i];
        }
        return arr[i] + usingFunc(arr,i+1);
    }
}
