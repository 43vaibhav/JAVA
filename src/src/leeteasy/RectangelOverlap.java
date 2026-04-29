package leeteasy;
import java.util.Scanner;
public class RectangelOverlap {
    /*An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.

Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap.

Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.

 

Example 1:

Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
Output: true
Example 2:

Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
Output: false
Example 3:

Input: rec1 = [0,0,1,1], rec2 = [2,2,3,3]
Output: false
  */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rec1[] = new int[4];
        System.out.println("RECTANGLE 1 :");
        for(int i = 0 ;i<4;i++){
            rec1[i] = sc.nextInt();
        }
        int rec2[] = new int[4];
        System.out.println("RECTANGLE 2 :");
        for(int i = 0 ;i<4;i++){
            rec2[i] = sc.nextInt();
        }
        sc.close();
        boolean ans = RecOverlap(rec1,rec2);
        if(ans){
            System.out.println("YES, THE RECTANGLES DO OVERLAP. ");
        }
        else{
            System.out.println("NO, THE RECTANGLES DONOT OVERLAP.");
        }
    }
    static boolean RecOverlap(int rec1[], int rec2[]){
        boolean flag = false;
        if(rec1[2]>rec2[0] && rec1[3] > rec2[1]){
            // THE BOTTOM-LEFT OF REC2 SHOULD BE SMALLER THAN TOP-RIGHT OF REC1 TO OVERLAP
            flag = true;
            if(rec1[2]>rec2[2] && rec1[3] > rec2[3]){
                // THE TOP-RIGHT OF REC2 SHOULD BE GRETER THAN TOP-RIGHT OF REC1 MEANING REC2 SHOULD BE AT THE RIGHT OF REC1
                flag = false;
            }
            if(rec2[2]>rec1[0] && rec2[3] > rec2[1]){
                // THE TOP-RIGHT OF REC2 SHOULD BE GRETER THAN BOTTOM-LEFT OF REC1 MEANING REC2 SHOULD BE AT THE RIGHT OF REC1
                flag = true;
            }

        }
        return flag;
    }
}
