import java.util.*;
public class urinals {
    Boolean goodString(String str) {
        Boolean isGood = true;
        //Check for only 0s and 1s in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '0')
                isGood = false;
        }
        return isGood;
    }
}
