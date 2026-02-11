/*
A leetcode problem
Problem Name - Count Items Matching a Rule
Problem Number - 1773
Problem Link - https://leetcode.com/problems/count-items-matching-a-rule/description/
*/

// LeetCode 1773 : Count Items Matching a Rule

import java.util.List;

public class CountItemsMatchingARule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int r = items.size();
        int ans = 0;

        for(int i=0; i<r; i++){

            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                ans++;
            }else if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                ans++;
            }else if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                ans++;
            }

        }

        return ans;
    }
}
