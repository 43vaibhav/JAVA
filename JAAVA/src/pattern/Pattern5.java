package pattern;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String args[]) {
        /* * * * * * 
         * _ * * * *
         * _ _ * * *
         * _ _ _ * *
         * _ _ _ _ *
         */
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int rows =0; rows<n;rows++){
                for(int space = 0; space < rows; space++){
                    System.out.print("  ");
                }

                for(int star = n;star>rows;star--){
                    System.out.print("* ");
                }
                System.out.println();

            }
        }

    }

}
