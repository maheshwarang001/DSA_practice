public class RotedBinarySearch {

    public static void main(String[] args) {

        int nums[] = {4,5,6,7,8,1,2,3};
        System.out.println(rotate(nums,0 , nums.length-1 , 2));

    }

    static int rotate(int nums[] , int start , int end , int target){

        if(start > end) return  -1 ;

        int mid = start + (end - start)/2;

        if(nums[mid] == target) return mid;

        if(nums[start] <= nums[mid]){

            if(mid >= nums[start] && mid<= nums[mid]){
                return rotate(nums,start , mid , target);
            }else{
                return rotate(nums, mid+1, end , target);
            }
        }
        if(target  >= nums[mid+1]  && target <= nums[end]){
            return rotate(nums,mid+1, end, target);
        }

        return rotate(nums,start , mid , target);

    }
}
