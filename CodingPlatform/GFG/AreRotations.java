package CodingPlatform.GFG;

public class AreRotations {     // Check if strings are rotations of each other or not

    public static void main(String[] args) {
        String s1 = "vikasdevvikas";
        String s2 = "devvikasvikas";
        System.out.println(areRotations(s1, s2));
        
    }
    static boolean areRotations(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            s1 = s1+s1;
            return s1.contains(s2);
        }
    }
}
