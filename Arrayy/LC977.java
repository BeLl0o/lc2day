import java.util.Scanner;
import java.util.Arrays;
public class LC977 {
    public int[] sortedSquares(int[] nums) {
        //2pointer
        /*
        int [] res = new int[nums.length];
        int n = nums.length - 1;
        int l = 0, r = n;
        while(l <= r){
            if(Math.abs(nums[l]) < Math.abs(nums[r])){
                res[n] = nums[r] * nums[r];
               r--;
            }else{
                res[n] = nums[l] * nums[l];
                l++;
            }
            n--;
            
        }
        return res;
        */
        //traditional way
        /*  
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
        */
        return nums;

        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array");
        String[] split = in.nextLine().split(" ");
        int[] nums = new int[split.length];
        for(int i = 0; i < split.length; i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        in.close();
        LC977 test = new LC977();
        int[] res = test.sortedSquares(nums);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
