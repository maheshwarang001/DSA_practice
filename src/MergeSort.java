public class MergeSort {
    public static void main(String[] strs) {

        int nums[] = new int[]{2,0,2,1,1,0};

        divide(nums, 0, nums.length - 1);
        for (int s : nums) {
            System.out.println(s);
        }

    }


    public static void divide(int nums[], int s, int e) {
        if (s >= e) return;

        int mid = s + (e - s) / 2;
        divide(nums, s, mid);
        divide(nums, mid + 1, e);

        merge(nums, s, mid, e);

    }

    public static void merge(int nums[], int s, int mid, int e) {

        int merged[] = new int[e-s + 1];

        int i = s;
        int j = mid + 1;
        int x = 0;

        while (i <= mid && j <= e) {
            if (nums[i] <= nums[j]) {
                merged[x++] = nums[i++];
            } else {
                merged[x++] = nums[j++];
            }
        }

        while (i <= mid) {
            merged[x++] = nums[i++];
        }
        while (j <= e) {
            merged[x++] = nums[j++];
        }

        for (i = s; i <= e; i++) {
            nums[i] = merged[i - s];
        }


    }


}

