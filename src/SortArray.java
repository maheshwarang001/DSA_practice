public class SortArray {
    public static void main(String strs []){
        int nums[] = {2,2,4,8,7,8,5,3,2,4,5,6,7,8};
        System.out.println(sort(nums,nums.length-1,2));
    }
    public static int sort(int[]nums, int i, int target ){

        if(i < 0 ) return -1;

        if(nums[i]  == target){
            return i;
        }
        return sort(nums,i-1 , target);
    }
}
