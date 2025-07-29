package start1;
import java.util.Scanner;
public class ExampleBreak {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                if(n % i == 0){
                   System.out.println(i);
                }
        }
        System.out.println();
        FindHighestFactor(n);
    }
        }
        
    public static void FindHighestFactor(int n) {
        for(int i = n -1; i>0; i--){
            if(n % i == 0){
                System.out.println(i);
                break;
            }
        }
    }

}
