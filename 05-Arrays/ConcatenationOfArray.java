import java.util.Arrays;

public class ConcatenationOfArray{
    public static void main(String[] args){
        int[] arr = {1, 2, 1};
        int[] concatenateArray = concatenation(arr);

        //Displaying concatenate array
        System.out.println(Arrays.toString(concatenateArray));
    }

    //Creating a function which return concatenate array
    static int[] concatenation(int[] arr){
        int n = arr.length;
        int[] ans = new int[2*n];
        int x = 0, i = 0;

        while(x < ans.length){
            if(i == n) i = 0;
            ans[x++] = arr[i++];
        }
        return ans;
    }
}
