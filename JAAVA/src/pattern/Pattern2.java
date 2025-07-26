package pattern;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int row = 0;
            
            while(row<n){
                int i = 0;
                while(i<=row){
                    
                    System.out.print("* ");
                    i++;
                }
                row++;
                System.out.println();
            }

    }
    }
   
    
}
