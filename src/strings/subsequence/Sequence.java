package strings.subsequence;


import java.util.*;

public class Sequence {

    public static void main(String[] args) {

//
//       for( String s: subsequence("","abc")){
//           System.out.print(s + " ");
//       };


        System.out.println(4 - 'a');
    }


    static List<String> subsequence(String p, String og){
        if(og.isEmpty()){
            List<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }

        char ch = og.charAt(0);

      List<String> result = subsequence(p + ch , og.substring(1));   //    left side
       result.addAll(subsequence(p   , og.substring(1))); //    right side


        List<String> ascii = subsequence(p + (ch+0), og.substring(1));

        return ascii;
    }

}



