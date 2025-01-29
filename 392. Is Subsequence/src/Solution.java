class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] wordS = s.toCharArray();
        char[] wordT = t.toCharArray();
        int left = 0;
        
        if(s.length() == 0) {
            return true;
        } else {
            for(int right = 0; right < t.length(); right++) {
                if(wordT[right] == wordS[left]) {
                    left++;
                }
                if(left == s.length()) {
                    break;
                }
            }
    
            if(left==s.length()) {
                return true;
            } else {
                return false;
            }
        }
    }
}