import java.util.Arrays;

public class RQuickSort {

    public static void main(String[] args) {

        int[]nums = {5,4,3,-2,1,0,9,-1};
        quick(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void quick(int []nums,  int low , int hi){

        if(low >= hi)return;

        int s = low;
        int e = hi;
        int pivot = nums[low + (hi-low)/2];

        while(s<=e){

            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quick(nums,low,e);
        quick(nums,s,hi);

    }
}
 class car{
    public void aa(){}
 }
 class f extends car{
    public void aa(int speed){

    }
    public void aa(){

    }
 }

