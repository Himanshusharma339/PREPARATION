import java.util.*;

public class palindrone {
    public static boolean isPalindrone(String str){
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                //not plindrone
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="racecar";
        System.out.println(isPalindrone(str));

        
    }
}//T C is O(n)
