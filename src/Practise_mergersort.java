public class Practise_mergersort {

    public static void main(String[] args) {

        int nums[] = {6,5,3,2,1,4};

        divide(nums,0, nums.length-1);
        for (int i : nums){
            System.out.print(i+ " ");
        }

    }

    static void divide(int[] nums, int s , int e){
        if(s >= e) return;

        int mid = s + (e-s)/2;

        divide(nums,0,mid);
        divide(nums,mid+1,e);
        merge(nums,s,mid,e);
    }

    static void merge(int[] nums, int s , int mid , int e){

        int[] main = new int[e-s +1];

        int i = s;
        int j = mid+1;
        int x = 0;

        while(i<= mid && j<=e){
            if(nums[i] <= nums[j]){
                main[x++] = nums[i++];
            }else{
                main[x++] = nums[j++];
            }
        }

        while(i<=mid){
            main[x++] = nums[i++];
        }
        while(j<=e){
            main[x++] = nums[j++];
        }


       for(int a = s ; a<=e ; a++){
          nums[a] = main[a-s];
       }
    }
}
