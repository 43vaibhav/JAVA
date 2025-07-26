package start1;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int i = 1 ;
            while(i<=n){
            System.out.println(i);
            i++;
        }

        }
        
    }
}
