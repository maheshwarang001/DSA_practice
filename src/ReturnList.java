
import java.util.*;

public class ReturnList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(4, 1, 2, 3, 4));
        List<Integer> list = sorter(nums,new ArrayList<>(), 0, 4);

        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
    static List<Integer> sorter(List<Integer> nums, List<Integer> temp , int i, int target){

        if(i == nums.size()){
            return temp;
        }

        if( nums.get(i) == target){
            temp.add(i);
        }

        return sorter(nums,temp,++i,target);


    }
}
