/**

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Input: nums = [1,0,2]
Output: [0,1,2]



Initially i used two pointer algorithm to solve it but the test case 1 0 2 was the edge case. Dutch National Flag uses three pointers, 

divides the array into three zone.  i  j  k

increment j until 0 is found and then swap with i (it manages the 1 and 0)
if 2 is found by j then swap it with k which the arr's last zone
 

**/



class Solution {
    public void sortColors(int[] nums) {


        int n = nums.length;

        int k = n-1;
        int i = 0;
        int j = 0;

        while( j <= k){

            if(nums[j] == 0 ){

                swap(i,j,nums);
                i++;
                j++;
            }

            else if( nums[j] == 2 ){
                swap(j,k,nums);
                k--;
            }

            else{
                j++;
            }
        }
        
    }

    public void swap(int i, int j, int[] nums){
        if(i != j){
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
