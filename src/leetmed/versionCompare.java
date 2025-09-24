package leetmed;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;


public class versionCompare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("VERSION1 : ");
        String v1 = sc.nextLine();
        System.out.println("VERSION2 : ");
        String v2 = sc.nextLine();
        System.out.println("USING STRING TOKENIZER: ");
        System.out.println(usingTokens(v1,v2));
        System.out.println("USING SPLIT: ");
        System.out.println(usingSplit(v1,v2));
        sc.close();

    }
    static int usingTokens(String v1, String v2){
        StringTokenizer tokenizer1 = new StringTokenizer(v1,".");
        StringTokenizer tokenizer2 = new StringTokenizer(v2,".");

        List<Integer> token1 = new ArrayList<>();
        List<Integer> token2 = new ArrayList<>();

        while(tokenizer1.hasMoreTokens()){
            token1.add(Integer.parseInt(tokenizer1.nextToken()));

        }
        while(tokenizer2.hasMoreTokens()){
            token2.add(Integer.parseInt(tokenizer2.nextToken()));
        }
        int n = Math.max(token1.size(), token2.size());
        for(int i =0;i<n;i++){
            int num1 = i < token1.size() ? token1.get(i) : 0;
            int num2 = i < token2.size() ? token2.get(i) : 0;

            if(num1 < num2) return -1;
            if(num1 > num2) return 1;

        }
        return 0;

    }
    static int usingSplit(String v1, String v2){
        String[] token1 = v1.split("\\.");
        String[] token2 = v2.split("\\.");

        int n = Math.max(token1.length, token2.length);
        for(int i = 0 ; i < n;i++){
            int num1 = i < token1.length ? Integer.parseInt(token1[i]) : 0;
            int num2 = i< token2.length ? Integer.parseInt(token2[i]) : 0;

            if(num1 > num2) return 1;
            if(num2 > num1) return -1;
        }
        return 0;
    }
}
