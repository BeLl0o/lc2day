package Arrayy;
import java.util.*;
class LC15{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer> > res = new ArrayList();
        for(int i = 0; i < len - 2; i++){
            if(nums[i] > 0) return res;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = len - 1;
            while(j < k){
                int cur = nums[i] + nums[j] + nums[k];
                if(cur == 0){
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j + 1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k - 1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(cur < 0){
                    j++;
                }else{
                    k--;
                }
            }

        }
        return res;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter nums");
        String[] split = in.nextLine().split(" ");
        in.close();
        int[] nums = new int[split.length];
        for(int i = 0; i < split.length; i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        LC15 test = new LC15();
        List<List<Integer>> ans = test.threeSum(nums);
        for(int i = 0; i < ans.size(); i++){
            for(int j = 0; j < 3; j++){
                System.out.println(ans.get(i).get(j) + " ");
            }
            System.out.println("\n");
        }
    }
}