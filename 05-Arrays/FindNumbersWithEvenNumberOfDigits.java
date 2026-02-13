/*
A leetcode problem
Problem Name - Find Numbers with Even Number of Digits
Problem Number - 1295
Problem Link - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
*/

// LeetCode 1295 : Find Numbers with Even Number of Digits

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for(int el : nums){
            if(even(el)) ans++;
        }
        return ans;
    }

    int countDigits(int nums){
        if(nums < 0){
            nums *= -1;
        }
        if(nums == 0) return 1;
        int count = 0;
        while(nums > 0){
            count++;
            nums /= 10;
        }
        return count;
    }

    boolean even(int nums){
        int numberOfDigits = countDigits(nums);
        return numberOfDigits % 2 == 0;
    }
}
