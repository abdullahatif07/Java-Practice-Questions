/*
A leetcode problem
Problem Name - Find the Highest Altitude
Problem Number - 1732
Problem Link - https://leetcode.com/problems/find-the-highest-altitude/description/
*/

// LeetCode 1732 : Find the Highest Altitude

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        arr[0] = 0;

        for(int i=0; i<n; i++){
            arr[i+1] = gain[i] + arr[i];
        }

        return max(arr);
    }

    //Finding the max element in the array
    int max(int[] arr){
        int m = arr[0];
        for(int el : arr){
            if(el > m) m = el;
        }
        return m;
    }
}
