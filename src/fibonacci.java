public class fibonacci {
    public static void main (String strs [ ]){

        System.out.println(fib(9));
    }

    static int fib(int i){
        if(i == 0 || i == 1){
            return i;
        }
        int f1 = fib(i-1);
        int f2 = fib(i-2);

        return f1+ f2;
    }
}
