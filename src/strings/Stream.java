package strings;

public class Stream {
    public static void main(String[] args) {

//        String op = "aadfsdfssaaass";
//        skip("",op);


        String name = "my anme ismahesh warang";
        System.out.println(skipString("",name));
    }

    static void skip(String  p, String op){

        if(op.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = op.charAt(0);

        if(ch == 'a'){
            skip(p, op.substring(1));
        }else{
            skip(p + ch, op.substring(1));
        }

    }


    static String skipString(String pr , String up){
        if(up.isEmpty()) return pr;

        if(up.startsWith("mahesh")){
          return skipString(pr,up.substring(6));
        }
        return up.charAt(0) + skipString(pr,up.substring(1));

    }
}
