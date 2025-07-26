package pattern;
import java.util.Scanner;
public class Pattern7 {
    public static void main(String args[]){
        /*
         * * * * * * 
         * * _ _ _ *
         * * _ _ _ *
         * * _ _ _ *
         * * * * * * 
         */
    try (Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        for(int row = 0 ; row< n ; row++){
            for(int star = 0;star<n;star++){
                if(row == 0 || star == 0 ||row == n -1 || star == n -1){
                    System.out.print("* ");
                    
                }
                else{ 
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        


    }
    }

}
