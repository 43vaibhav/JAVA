package leeteasy;
import java.util.Scanner;
public class Max69Pair {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.print(MaxPair(n));
        }
    }
    static int MaxPair(int n){
        int temp= n;
        int pos= 0;
        int i = -1;
        while(temp> 0){
            if(temp % 10== 6){
                i = pos;
            }
            temp /= 10;
            pos++;
        }
        if(i != -1){
            n += 3 * Math.pow(10,i);
        }
        return n ;
    }

}
