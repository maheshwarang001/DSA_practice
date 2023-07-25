public class InsertionSort {

    public static void main(String[] strings){
        int nums[] = new int[]{4,2,5,7,3,1};


        for(int i = 1 ; i < nums.length; i++){

            int temp = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j]>temp){

                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;

        }

        for(int i : nums){
            System.out.println(i);
        }
    }
}
