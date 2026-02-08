/*
A leetcode problem
Problem Name - Kids With the Greatest Number of Candies
Problem Number - 1431 
Problem Link - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
*/

// LeetCode 1431: Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = maxEl(candies);

        for(int i=0; i<candies.length; i++){
            if((candies[i] + extraCandies) >= max)
                ans.add(true);
            else
                ans.add(false);
        }

        return ans;
    }

    //Method for finding max element in the array
    int maxEl(int[] arr){
        int max = arr[0];
        for(int el : arr){
            if(el > max) max = el;
        }
        return max;
    }
}
