/*
A leetcode problem
Problem Name - Cells with Odd Values in a Matrix
Problem Number - 1252
Problem Link - https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
*/

// LeetCodse 1252 : Cells with Odd Values in a Matrix

public class CellsWithOddValuesInAMatrix {

    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for(int i=0; i<indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];

            for(int j=r; j<r+1; j++){
                for(int k=0; k<n; k++){
                    arr[j][k]++;
                }
            }

            for(int j=0; j<m; j++){
                for(int k=c; k<c+1; k++){
                    arr[j][k]++;
                }
            }
        }

        int oddCount = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] % 2 != 0)oddCount++;
            }
        }

        return oddCount;
    }

}
