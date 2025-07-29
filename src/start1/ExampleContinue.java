package start1;
import java.util.Scanner;
public class ExampleContinue {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i = 1 ; i<n;i++){
                if(i == 14 || i == 27){
                    continue;
                }
                if(i% 2 == 0 || i % 3 == 0){     
                    System.out.println(i);                     
                }
                
                
            }
        }
    }

}
