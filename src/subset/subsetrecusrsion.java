package subset;

import java.util.*;

public class subsetrecusrsion {

    public static void main(String[] args) {

    }

    static void sets (String s, List<String> temp , int i , int j ){

        if( i >= s.length()){
            return;
        }



    }



    // abc
}




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return sum(nums,new HashSet<>() , 0,0);
    }

    public List<List<Integer>> sum(int[] nums , Set<List<Integer>> set, int i , int j){

        if(i < nums.length - 2 ){
            return new ArrayList<>(set);
        }

         j = i+1;
        if( j < nums.length-1){
            if(nums [ i] + nums[j] +nums[j+1] == 0){
                set.add(Arrays.asList(nums[i] , nums[j] , nums[j+1] ));

                return sum( nums, set, i , ++j);
            }
            return sum(nums,set,i,++j);
        }

        return sum(nums,set,++i,++j);
    }


}


