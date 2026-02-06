import java.util.Arrays;

// Computes the running sum (prefix sum) of a 1D array
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        //Displaying the running sum array
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    //creating a fuction which return running sum of array
    static int[] runningSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            ans[i] = currSum;
        }

        return ans;
    }
}
