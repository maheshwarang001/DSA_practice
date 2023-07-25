public class RSelection_sort {

    public static void main(String[] args) {
        int num[] = {1,3,2,4,5,2};

        selectioN(num,num.length , 0, Integer.MIN_VALUE);

        for (int i : num){
            System.out.println(i);
        }


    }

    static void selectioN(int nums[] , int i , int j , int max){

        if(i == 0) return;

        if(j<i){
            if(nums[j] > nums[max]){
                selectioN(nums, i , j+1 , j);
            }
            selectioN(nums,i,j+1,max);
        }else{
            rotate(nums,max,i-1);
            selectioN(nums,i-1,0,max);
        }
    }
    static void rotate (int num[] , int i , int  j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

}
