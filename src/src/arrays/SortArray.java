package arrays;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i <arr.length;i++){
                arr[i] = sc.nextInt();
            }/* i m given an array in ascendingorder i need to return its squared answer  */
            /* arr= 1,2,3,4,5 op = 1,4,9,16,25
             * arr= -10,-5,-4,5,6,7 op = 16,25,25,36,49,100
             * so first i need to creta a method for checking if all elmets ar epositve or not 
             * 
             */
            CheckArray(arr);
            
        }
    }
    static void  CheckArray(int[] arr){
        /* it checks whether the first elemnet is 0 or greate rthan 0 or not if that 
         * is greater than 0 then none of o the othere elemnts will be less than 0
         * so we can directly print the arr
         * else we will call the two pointer method to order the negative numbers
         */
        
        
        if(arr[0] <0){       
            /* here it call s twopointers and we get the sorted abs val arr and now well print it */         
            TwoPointers(arr);
            
        }
        Printarr(arr);
    }
    static void Printarr(int[] arr){
        for(int i = 0 ;i< arr.length;i++){
            System.out.print((int)Math.pow(arr[i], 2) + "  ");
        }
    }
    static int[] TwoPointers(int arr[]){
 /*now we will sort the array in order of increasing the absolute of the arr of i  */
        for(int i  = 0 ;i< arr.length;i++){
            /*this wil run the loop from the i as 0 to i < n to traverse evry elemennt */
            int st = 0;
            int end = arr.length - 1;
            /* now using two pointers which will reset after evry loop one at strt and one at end  */
            while(st < end){
                /* if the abs val of start is greateer than abs val of end then we wil swap 
                 * them and increment st by 1 this checks that there is no big number at the starrt
                 *  for ex at arr[st] is -10 whose abs val is 10 and at arr[end] is 7 whose abs val is 
                 * 7, 10> 7 hence both will swap
                 */
                if(Math.abs(arr[st]) >  Math.abs(arr[end])){
                    Swap(arr,st,end);
                    st++;
                }
                /* now if the abs val of end is gretaer than abs val of strt no chnages just decrmenting end 
                 * as all big numbers should be at end only ex at arr[st ] iis -5 and at arr[end] is 10 
                 * 10> 5 hence we will decrement end and geck if any oyher val of end is smaller than -5 and will swap them
                 */
                else if(Math.abs(arr[st]) < Math.abs(arr[end])){
                    end--;
                }
            }
            
        }
        /* now we will return the array after sorting the abs val  */
        return arr;
    }
    static void Swap(int[] arr,int st,int end){
        int temp  = arr[st];
        arr[st]= arr[end];
        arr[end]  = temp;
    }

}
