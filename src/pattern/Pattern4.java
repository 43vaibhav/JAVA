package pattern;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
             /* n = 5
             * _ _ _ _ *
             * _ _ _ * *
             * _ _ * * *
             * _ * * * * 
             * * * * * * 
             *  
             */
            int n = sc.nextInt();
            
            for(int row = 0;row< n;row++){
                for(int space = 0;space < n - row;space--){
                    System.out.print("  ");
                }
                for(int star =n-row;star++){
                    System.out.print("*  ");

                }
                
                System.out.println();

            }
        }
    }
}
