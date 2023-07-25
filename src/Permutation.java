public class Permutation {

    public static void main(String strs[]){
        backstackPermutation("abc","");

    }
    public static void backstackPermutation(String s , String ans){

        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i<s.length(); i++){
            char current = s.charAt(i);
            String st = s.substring(0,i)+ s.substring(i+1);
            backstackPermutation(st,ans+current);
        }
    }
}


