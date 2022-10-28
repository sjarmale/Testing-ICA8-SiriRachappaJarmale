import java.util.*;
public class urinals {
    Boolean goodString(String str) {
        Boolean isGood = true;
        //Check for only 0s and 1s in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '0')
                isGood = false;
        }
        // Check whether string is already invalid
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == '1' && (str.charAt(i-1) == '1' || str.charAt(i+1) == '1')) {
                isGood = false;
            }
        }
        return isGood;
    }
}
