import java.util.Scanner;
import java.util.Arrays;
public class LC59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 1;
        if(n % 2 == 1){
            res[n / 2][n / 2] = n * n;
        }
        for(int start = 0;start < n / 2; start++){
            for(int i = start; i < n - start - 1; i++){
                res[start][i] = count++;
            }
            for(int i = start; i < n - start - 1; i++){
                res[i][n - start - 1] = count++;
            } 
            for(int i = n - 1 - start; i > start; i--){
                res[n - start - 1][i] = count++;
            } 
            for(int i = n - 1 - start; i > start; i--){
                res[i][start] = count++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        in.close();
        LC59 test = new LC59();
        int[][] ans = test.generateMatrix(n);
        for(int i = 0; i < n; i++){
           
            System.out.println(Arrays.toString(ans[i]));
   
        }
        
    }
}
