package Arrayy;
import java.util.Scanner;
public class LC27 {
    public int remove(int[] nums, int val){
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[res++] = nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array");
        String[] split = in.nextLine().split(" ");
        int[] nums = new int[split.length];
        for(int i = 0; i < split.length; i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        System.out.println("Enter the target number");
        int target = in.nextInt();
        LC27 test = new LC27();
        int res = test.remove(nums, target);
        System.out.println(res);



    }
}
