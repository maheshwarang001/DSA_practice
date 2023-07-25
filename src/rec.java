public class rec {

    public static void main (String strs[]){

        print(5);

    }

    public static void print(int i){
        if(i<0){
            return;
        }
        inc(i-1);
    }
    public static void inc(int i){
        if(i<0){
            return;
        }
        System.out.print(i + " ");
        inc(i-1);
    }


}
