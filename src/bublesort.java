public class bublesort {
    public static void main(String[] args){

        int nums[] = new int[]{4,2,5,7,3,1};

        for (int i = 0 ; i < nums.length - 1 ; i++){

            for (int j = i+1 ; j< nums.length ; j++){

                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i : nums){
            System.out.println(i);
        }
    }
}
