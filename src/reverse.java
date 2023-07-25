public class reverse {

    public static void main(String[] args) {
        System.out.println(reverse(110220));
    }
    static int reverse(int n){

        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);

    }
    static int helper(int n , int d){
        if(n%10 == n) return n;
        int rem = n %10;
        return (int) (rem * Math.pow(10, d - 1) + reverse(n / 10));

    }

}
