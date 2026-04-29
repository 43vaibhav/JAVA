package pattern;
import java.util.Scanner;
public class Pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int rows = 1; rows<= n;rows++){
            for(int star = 1; star<=rows;star++){
                System.out.print(star + " ");

            }
            System.out.println();
        }
    }
}
