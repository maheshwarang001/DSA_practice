

/**

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

**/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        int l = 0;
        int r = n-1;


        while(l <= r){

            for(int i = 0 ; i< r-l ; i++){

                int top = l;
                int bottom = r;

                int temp = matrix[top][l+i];

                //move bottom left to top left

                matrix[top][l+i] = matrix[bottom-i][l];

                //move bottom right to bottom left

                matrix[bottom-i][l] = matrix[bottom][r-i];

                //move top right to bottom right

                matrix[bottom][r-i] = matrix[top+i][r];

                //temp tp top right

                matrix[top+i][r] = temp; 
            }

            l++;
            r--;
        }
    }
}
