package dorting.sortingAlgos;
import java.util.Scanner;
public class QuickSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS:");
        int n= sc.nextInt();
        System.out.println();
        int arr[] = new int[n];
        for(int i = 0 ; i< n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("SORTED ARRAY:");
        quickSort(arr,n);
    }
    static void quickSort(int arr[],int n){
        
    }
}
