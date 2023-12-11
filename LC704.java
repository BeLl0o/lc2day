import java.util.Scanner;
public class LC704{
    //704.Binaray Search
    public int search(int[] nums, int target){
        
        int l = 0, r = nums.length - 1, mid, res = -1;
        while(l <= r){
            mid = (l + r) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }

        }

        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target number");
        int target = in.nextInt();
        System.out.println("Enter the nums array");
        in.nextLine();
        String[] split = in.nextLine().split(" ");
        in.close();
        int[] nums = new int[split.length];
        for(int i = 0; i < split.length; i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        LC704 test = new LC704();
        int res = test.search(nums, target);
        System.out.println(res);
        
    }
}
