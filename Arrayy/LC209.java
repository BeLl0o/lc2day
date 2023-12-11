import java.util.Scanner;
public class LC209 {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0, l = 0, r = 0, res = Integer.MAX_VALUE;
        while(l <= r && r < nums.length){
            sum += nums[r];
            r++;
            while(l <= r && r <= nums.length && sum >= target){
                    //System.out.println("Error");
                res = Math.min(res, r - l);
                sum -= nums[l];
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter target");
        int target = in.nextInt();
        System.out.println("Enter the array");
        in.nextLine();
        String[] split = in.nextLine().split(" ");
        in.close();
        int[] nums = new int[split.length];
        // int[] nums = {4, 3, 7, 2, 1};
        // int target = 7;
        LC209 test = new LC209();
        int res = test.minSubArrayLen(target, nums);
        System.out.println(res);

    }
}
