package bitwise;

import java.util.Stack;

public class Binary {


    //convert decimal to binary
    public static String decimalBinary(int x){

        Stack<Character> stack = new Stack<>();

        while(x > 0){

            if(x % 2 == 1 )stack.push('1');
            else stack.push('0');

            x = x/2;
        }



        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()){
            str.append(stack.pop());
        }


        return str.toString();
    }

    public static void main(String[] args) {

        String str = decimalBinary(13);
        System.out.println(str);
    }
}
