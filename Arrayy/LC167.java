
import java.util.Scanner;
public class LC167 {
    public int[] twoSum(int[] numbers, int target){
        int l = 0, r = numbers.length - 1;
        while(l < r){
            if(numbers[l] + numbers[r] > target){
                r--;
            }else if(numbers[l] + numbers[r] < target){
                l++;
            }else{
                
               return new int[]{l + 1, r + 1};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        String[] split = in.nextLine().split(" ");
        int[] numbers = new int[split.length];
        for(int i = 0; i < split.length; i++){
            numbers[i] = Integer.parseInt(split[i]);
        }
        System.out.println("Enter target number");
        int target = in.nextInt();
        in.close();
        LC167 test = new LC167();
        int[] res = test.twoSum(numbers, target);
        for(int i = 0; i < 2; i++){
            System.out.println(res[i]);
        }

    }
}
