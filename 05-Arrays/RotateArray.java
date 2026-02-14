/*
A leetcode problem
Problem Name - Rotate Array
Problem Number - 189
Problem Link - https://leetcode.com/problems/rotate-array/description/
*/

// LeetCode 189 : Rotate Array

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return;
        int[] arr = new int[n];

        k = k % n;
        int x = 0;
        for(int i=n-k; i<n; i++){
            arr[x++] = nums[i];
        }

        for(int i=0; i<n-k; i++){
            arr[x++] = nums[i];
        }

        for(int i=0; i<n; i++){
            nums[i] = arr[i];
        }
    }
}
