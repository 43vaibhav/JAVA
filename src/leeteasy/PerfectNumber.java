package leeteasy;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.print(checkPerfectNumber(num));
        }
    }
    
    public static boolean checkPerfectNumber(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return sum == num;
    }  
}
