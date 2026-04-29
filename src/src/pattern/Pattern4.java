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
            int row = 0 ;
            while(row<n){
                int space = n -1;
                while(space>row){
                    System.out.print("A ");
                    space--;
                }
                int star= 0;
                while(star<=row){
                    System.out.print("* ");
                    star++;
                }
                row++;
                System.out.println();
            }
        }
    
    }
    

}
