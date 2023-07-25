import java.util.*;

public class Backtracking {


    public static void main(String[] strs){
//        findsubsets("abc","",0);

        List<List<Integer>> result = new ArrayList<>();
        int []nums = {1,2,3};

        subsets(nums,result,new ArrayList<>(),0 );

        for (List<Integer> integers : result) {

            for(Integer i : integers){
                System.out.print(i + ' ');
            }

        }




    }

    public static void findsubsets(String str, String ans, int i){

        //base case
        if(i==str.length()){
            System.out.println(ans.isEmpty()?-1:ans);
            return;
        }
        //no
        findsubsets(str,ans,i+1);
        //yes
        findsubsets(str,ans+str.charAt(i),i+1);

    }

    static void subsets(int[] nums, List<List<Integer>> result, List<Integer> subset, int i) {
        if (i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // Exclude the current element
        subsets(nums, result, subset, i + 1);

        // Include the current element
        subset.add(nums[i]);
        subsets(nums, result, subset, i + 1);

        // Backtrack by removing the current element
        subset.remove(subset.size() - 1);
    }

}
