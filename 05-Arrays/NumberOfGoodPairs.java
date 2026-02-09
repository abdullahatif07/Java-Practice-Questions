/*
A leetcode problem
Problem Name - Number of Good Pairs
Problem Number - 1512
Problem Link - https://leetcode.com/problems/number-of-good-pairs/description/
*/

// LeetCode 1512 : Number of Good Pairs

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j])count++;
            }
        }

        return count;
    }
}
