package start1;

import java.util.Scanner;

//import java.util.Scanner;
public class PrintEvenOdd {
    public static void main(String[] args) {
        /*n = 5
         *n% 2 == 0 False
         output= 1 3 5
         n = 6
         n % 2 == 0 trur
         op = 2,4,6
         */
         try (Scanner Sc  = new Scanner(System.in)){
            int n = Sc.nextInt();
            
            int i = 1;
            
            while(i<=n) { // TRUE 
                if(n % 2 == 0){
                    EvenPrint(n);
                    break;
                
                }
                else{
                    OddPrint(n);
                    break;
                }
                
            }
        }
    }
    
    public static void EvenPrint(int n){
        int i = 2;
        while(i<=n){
            System.out.println(i);
            i+=2;
                
        }
    }

    public static void OddPrint(int n){
        int j = 1;
        while(j <= n){
            System.out.println(j);
            j+=2;
            

        }
    }
}


