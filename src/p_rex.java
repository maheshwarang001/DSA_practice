import java.util.*;

public class p_rex {

    public static void main(String[] args) {


        int [] nums = {1,2,4,5,6,7,8};

        System.out.println(fib(12));

//        recursion(nums,0, nums.length-1);
//
//        for(int i : nums){
//            System.out.print(i + " ");
//        }

//        System.out.println( rec("mahesh",0,2));
    }
//    static int rec(String name , int sum, int i){
//
//        if(i < 0) {
//            return sum;
//        }
//        return rec(name,sum+i , --i);
//    }


//    static void recursion(int [] nums, int i , int n ){
//        if(i>n){
//            return;
//        }
//
//        int temp = nums[i];
//        nums[i] = nums[n];
//        nums[n] = temp;
//
//        recursion(nums, ++i, --n);
//    }



    static int fib(int i){
        if(i <= 1){
            return i;
        }

        return fib(i-1) + fib(i-2);
    }
}
