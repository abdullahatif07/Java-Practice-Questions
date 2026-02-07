/*
A leetcode problem
Problem Name - Build Array from Permutation
Problem Number - 1920 
Problem Link - https://leetcode.com/problems/build-array-from-permutation/description/
*/

public class BuildArrayFromPermutation{
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int el = nums[i];
            ans[i] = nums[el];
        }
        
        return ans;
    }
}
