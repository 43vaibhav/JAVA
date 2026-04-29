package leeteasy;
public class HillValley {
    public static void main(String[] args) {
        int[] nums = {2,4,1,1,6,5};
        int cout=0;
        for(int i = 1;i<nums.length - 1;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            int j = i +1;
            while(j<nums.length && nums[j] == nums[i]){
                j++;
            }
            if(j >= nums.length){
                break;
            }
            if(nums[i] > nums[i-1] && nums[i] > nums[j] ||
               nums[i] < nums[i-1] && nums[i] < nums[j]){ 
                cout++;
            }
            
            
        }
            
        System.out.print(cout);
    }
}
