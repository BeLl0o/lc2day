
import java.util.Scanner;
public class LC5 {
    public String find(String s, int l, int r){
        while(0 <= l && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
    public String longestPalindrome(String s) {
        String res = "", tmp1, tmp2;
        for(int i = 0; i < s.length(); i++){
            tmp1 = find(s, i, i);
            tmp2 = find(s, i, i + 1);
            if(tmp1.length() > res.length()){
                res = tmp1;
            }
            if(tmp2.length() > res.length()){
                res = tmp2;
            }
        }
        return res;
    }
}
