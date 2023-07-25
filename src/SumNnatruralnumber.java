public class SumNnatruralnumber {

    public static void main(String strs[]){
        System.out.println(  sum(10));
    }

//    factorial * sum +

    static int sum(int i){

        if( i == 1) return  1;

        int sm1 = sum(i-1);
        int sm = i*sm1;
        return sm;

    }
}
