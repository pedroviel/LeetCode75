import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        Set<Character> vowelSet = new HashSet<>();
        
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');

        while(start<end) {
            while (start<end && !vowelSet.contains(word[start])) {
                start++;
            }

            while(start<end && !vowelSet.contains(word[end])) {
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        String answer = new String(word);
        return answer;
    }
}