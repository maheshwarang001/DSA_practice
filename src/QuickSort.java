public class QuickSort {
    public static void main(String[] strs){
        int nums[] = new int[]{4, 2, 5, 7, 3, 1};


        quickSort(nums,0, nums.length-1);

        for (int i : nums){
            System.out.println(i);
        }



    }

    public static void quickSort(int nums[], int s, int e){
        if(s>=e) return;

        int pivot = nums[e];
        int leftpointer = s;
        int rightpointer = e;

        while(leftpointer < rightpointer){
            while(nums[leftpointer] <= pivot && leftpointer < rightpointer){
                leftpointer++;
            }
            while(nums[rightpointer] >= pivot && leftpointer<rightpointer){
                rightpointer--;
            }

            swap(nums,leftpointer,rightpointer);
        }
        swap(nums,leftpointer,e);

        quickSort(nums,s,leftpointer-1);
        quickSort(nums,leftpointer+1,e);

    }

    public static void swap(int nums[], int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
