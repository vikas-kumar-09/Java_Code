package Recursion.Recursion_subset_string;

public class Stream {
    public static void main(String[] args) {
        // skip("", "abbacdah");
        // skip2("bacc");
        // System.out.println(skipApple("bcdapplegf"));
        System.out.println(skipAppNotApple("abcdappegf"));
        
    }
    // return type is void || returning the character after removing a from string
    static void skip(String p, String up){
        // p =  initially empty string
        // up = original string
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

    // return type is string
    static String skip2(String up){
        // up = original string
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip2(up.substring(1));
        }
        else{
            return ch + skip2(up.substring(1));
        }
    }

    // return type is String (skip apple)
    static String skipApple(String up){
        // up = original string
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    // return App not apple 
    static String skipAppNotApple(String up){
        // up = original string
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
