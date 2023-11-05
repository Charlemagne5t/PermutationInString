import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);


        int left = 0;
        int right = s1.length();
        while (right != s2.length()  + 1){
            char[] chars2 = s2.substring(left, right).toCharArray();
            Arrays.sort(chars2);
            if(Arrays.equals(chars1,chars2)){
                return true;
            }

            left++;
            right++;
        }
        return false;
    }

}