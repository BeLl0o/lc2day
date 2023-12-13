import java.util.Scanner;
public class LC283 {
    public void removeZero(int[] nums){
        int valid = 0, start = 0;
        while(start < nums.length){
            if(nums[start] != 0){
                nums[valid++] = nums[start];
            }
            start++;
        }
        while(valid < nums.length){
            nums[valid++] = 0;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        return;
    }
}
