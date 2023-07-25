public class power {

    public static void main( String strs[]){

        System.out.println(opt(2,24));
    }

    public static int power (int x , int n){
        if(n == 0 ) return 1;

        return x * power(x, n-1);
    }

    public static int opt(int x , int n){

        if(n==0) return 1;

        int h = opt(x,n/2);
        int h1 = h * h;
        if(n%2 != 0) h1 = x * h1;
        return h1;
    }


}
