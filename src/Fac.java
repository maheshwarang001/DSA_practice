public class Fac {
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
    public static int fact(int i){
        if(i == 1){
            return 1;
        }
        return i + fact(--i);
    }
}
