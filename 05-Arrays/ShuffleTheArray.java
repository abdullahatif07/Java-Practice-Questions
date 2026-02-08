/*
A leetcode problem
Problem Name - Shuffle The Array
Problem Number - 1470
Problem Link - https://leetcode.com/problems/shuffle-the-array/description/
*/

// LeetCode 1470 : Shuffle The Array


public class ShuffleTheArray {
    //Solving using a while loop
    public int[] shuffle(int[] nums, int n) {
        int i = 0, x = 0;
        int[] arr = new int[2*n];

        while(x < 2*n){
            arr[x++] = nums[i];
            arr[x++] = nums[n+i];
            i++;
        }

        return arr;
    }

    //Solving using a for loop
    public int[] shuffle2(int[] nums, int n) {
        int[] arr = new int[2*n];
        int idx = 0;
        
        for(int i=0; i<n; i++){
            arr[idx++] = nums[i];
            arr[idx++] = nums[i+n];
        }

        return arr;
    }
}
