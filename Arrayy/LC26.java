package Arrayy;
import java.util.Scanner;
public class LC26 {
    public int removeDuplicates(int[] nums){

        int fast = 0, slow = 0;
        while(fast < nums.length){
            //System.out.println(nums[fast] + " " + nums[slow]);
            if(nums[fast] != nums[slow]){
                
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(" ");
        in.close();
        int[] nums = new int[split.length];
        for(int i = 0; i < split.length; i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        LC26 test = new LC26();
        int res = test.removeDuplicates(nums);
        System.out.println(res);
    }
}
