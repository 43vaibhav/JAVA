package leetmed;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;


public class versionCompare {
    /*165. Compare Version Numbers
Given two version strings, version1 and version2, compare them. A version string consists of revisions separated by dots '.'. The value of the revision is its integer conversion ignoring leading zeros.

To compare version strings, compare their revision values in left-to-right order. If one of the version strings has fewer revisions, treat the missing revision values as 0.

Return the following:

If version1 < version2, return -1.
If version1 > version2, return 1.
Otherwise, return 0.
 

Example 1:

Input: version1 = "1.2", version2 = "1.10"

Output: -1

Explanation:

version1's second revision is "2" and version2's second revision is "10": 2 < 10, so version1 < version2.

Example 2:

Input: version1 = "1.01", version2 = "1.001"

Output: 0

Explanation:

Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

Example 3:

Input: version1 = "1.0", version2 = "1.0.0.0"

Output: 0

Explanation:

version1 has less revisions, which means every missing revision are treated as "0 */
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
        System.out.println("USING LOOPS:");
        System.out.println(usingLoops(v1,v2));
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
    static int usingLoops(String v1, String v2){
        int n1 = v1.length();
        int n2 = v2.length();
        int i=0;int j=0;

        while(i < n1 || j < n2){
            int num1 =0;
            int num2 =0;
            while(i < n1 && v1.charAt(i) != '.'){
                num1 = num1 * 10 + (v1.charAt(i) - '0');
                i++;
            }

            while(j < n2 && v2.charAt(j) != '.'){
                num2 = num2 * 10 + (v2.charAt(j)  - '0');
                j++;
            }
            if(num1 > num2) return 1;
            if(num2 > num1) return -1;
            i++;
            j++;
        }
        return 0;

    }
}
