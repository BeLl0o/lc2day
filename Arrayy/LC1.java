package Arrayy;
import java.util.*;

public class LC1{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(target - nums[i])){
                return new int[]{hash.get(target - nums[i]), i};
            }else{
                hash.put(nums[i], i);
            }
        }
        return new int[]{};

    }
    public int count(int n){
        int res = 0;
        while(n != 0){
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }
    public boolean isHappy(int n){
        HashMap<Integer, Integer> hash = new HashMap<>();
        while(n != 1){
            if(hash.containsKey(n)){
                return false;
            }else{
                hash.put(n, 1);
            }
            n = count(n);
        }
        return true;
    }
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1, set2 = new HashSet();
        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : set1){
            if(set2.contains(num)){
                set.add(num);
            }
        }
        int[] res = new int[set.size()];
        int idx = 0;
        for(int num : set){
            res[idx++] = num;
        }

        return res;
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter nums");
        // String[] split = in.nextLine().split(" ");
        // int[] nums = new int[split.length];
        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = Integer.parseInt(split[i]);
        // }
        System.out.println("Enter target");
        int target = in.nextInt();
        in.close();
        LC1 test = new LC1();
        boolean ans = test.isHappy(target);
        System.out.println(ans);
        //int[] res = test.twoSum(nums, target);
        // for(int i = 0; i < 2; i++){
        //     System.out.println(res[i] + " ");
        // }
        
    }
}