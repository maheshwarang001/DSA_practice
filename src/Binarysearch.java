
import java.util.*;



public class Binarysearch {

    public static void main(String[] strs){

        List<Integer> nums = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);


        System.out.println(binary(nums,3 ));


    }

    static int binary(List<Integer> arr, int target){

        int start = 0;
        int end = arr.size() - 1;

        while(start<=end){

            int mid = start + (end - start) / 2;

            if(target < arr.get(mid)){
                start = mid + 1;
            }
            else if(target > arr.get(mid)){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return 0;

    }
}
