public class SelectionSort {
    public static void main(String[] args) {

            int nums[] = new int[]{8, 5, 3, 9, 4, 6, 7, 1, 2};


            for(int i = 0 ; i<nums.length-1 ; i++){
            int minimum = i;
            for(int j = i+1 ; j<nums.length ; j++ ){
                if(nums[minimum] > nums[j] ){
                    minimum = j;
                }
            }

            if(minimum != i) {
                int temp = nums[minimum];
                nums[minimum] = nums[i];
                nums[i] = temp;
            }

        }

        for(int i : nums){
            System.out.println(i);
        }

    }
}