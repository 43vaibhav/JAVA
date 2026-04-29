package leetmed;

public class SumThreePower {
    public static void main(String args[]) {
        int n = 12;
        int ans = n % 3;
        if(ans == 0 || ans == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }        
    }
}