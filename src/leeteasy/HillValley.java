package leeteasy;
public class HillValley {
    public static void main(String[] args) {
        int[] nums = {2,4,1,1,6,5};
        int hill=0;
        int valley=0;
        for(int i = 1;i<nums.length - 1;i++){   
            if(nums[i] > nums[i-1] && nums[i] > nums[i-1]){
                hill++;
            }
            else if(nums[i]< nums[i-1]&& nums[i] < nums[i+1] ){
                valley++;
            }
            
        }
            
        System.out.print(hill+valley);
    }
}
