/*
A leetcode problem
Problem Name - How Many Numbers Are Smaller Than the Current Number
Problem Number - 1365
Problem Link - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
*/

// LeetCode 1365 : How Many Numbers Are Smaller Than the Current Number

public class HowManyNumbersAreSmallerThanCurrent{

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];  

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j] < nums[i])count++;
            }
            ans[i] = count;
        }

        return ans;
    }
    
}
