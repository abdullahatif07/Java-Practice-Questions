/*
A leetcode problem
Problem Name - Richest Customer Wealth
Problem Number - 1672 
Problem Link - https://leetcode.com/problems/richest-customer-wealth/description/
*/

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;

        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            ans = Math.max(ans, sum);
        }

        return ans;
    }

}
