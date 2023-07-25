public class RBubleSort {

    public static void main(String[] args) {

        int num[] = {1,3,2,4,5,2};

        sort(num,num.length-1 , 0);

        for (int i : num){
            System.out.println(i);
        }

    }
    static void sort(int num[] , int i , int j){
        if(i == 0){
            return ;
        }
        if(j<i) {

            if (num[i] > num[j]) {
                rotate(num, num[i], num[j]);
            }
            sort(num,i,j+1);
        }
        sort(num,i-1,0);
    }

    static void rotate (int num[] , int i , int  j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
