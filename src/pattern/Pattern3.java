package pattern;
import java.util.Scanner;
public class Pattern3 {
        public static void main(String[] args) {
           
        /*n = 5
          * * * * * 
          * * * *
          * * *
          * *
          *
         * 
         */
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int rows = 0;rows<n;rows++){
                for(int star = n; star>rows;star--){
                    System.out.print("* ");

                }
                System.out.println();
            }

        }

 }

}
