/*
A leetcode problem
Problem Name - Check if the Sentence Is Pangram
Problem Number - 1832
Problem Link - https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
*/

// LeetCode 1832 : Check if the Sentence Is Pangram

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        boolean[] arr = new boolean[26];

        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i=0; i<26; i++){
            for(int j=0; j<sentence.length(); j++){
                if(sentence.charAt(j) == ch[i]){
                    arr[i] = true;
                    break;
                }
            }
        }

        return ans(arr);
    }

    //method returns true if all index is true otherwise false
    boolean ans(boolean[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == false)return false;
        }

        return true;
    }
}
