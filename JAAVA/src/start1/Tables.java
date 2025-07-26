package start1;
import java.util.Scanner;
public class Tables {
    public static void main(String main[]){
        try (Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            int n = sc.nextInt();
            for(int i = 1; i<=n;i++){
                System.out.println(i * x);
            }        
            System.out.println();
            int an = x + (n-1)*x;
            for(int i = x;i<=an;i+=x){
                System.out.println(i);

            }
        }
    }

}
