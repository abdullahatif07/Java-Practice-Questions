// LeetCode 1389 : Create Target Array in the Given Order

/*
A leetcode problem
Problem Name - Create Target Array in the Given Order
Problem Number - 1389
Problem Link - https://leetcode.com/problems/create-target-array-in-the-given-order/description/
*/


import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    
    // Builds target array by inserting elements at given indices
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            list.add(index[i], nums[i]);
        }

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}
