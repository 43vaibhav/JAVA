package pattern;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int rows = 0 ; rows<n;rows++){
                for(int star = 0; star<n;star++){
                    if(rows == (n - 1 ) / 2 ){
                        if(star == (n - 1 ) / 2){
                            System.out.print("* ");
                        }
                        else {
                            System.out.print("A ");
                        }
                    } 
                     else if (rows %2 == 0){
                        if(star % 2 == 0){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("A ");
                        }
                    }
                    else{
                        if(star % 2 == 0){
                            System.out.print("A ");

                        }
                        else{
                            System.out.print("* ");
                        }
                        
                                
                    }
                }
                System.out.println();
            }
        }
    }

}
