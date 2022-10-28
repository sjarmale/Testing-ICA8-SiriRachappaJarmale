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

    int countFreeUrinals(String str){
        int n= str.length();
        int counter=0;
        if (!this.goodString(str)) {
            return -1;
        }
        for(int i=0; i<n-1; i++ ){
            if(i==0 && str.charAt(i)=='0' && str.charAt(i+1)=='0') {
                counter++;
                str = str.substring(0, i) + '1'
                        + str.substring(i + 1);
            } else {
                if(str.charAt(i)=='0' && str.charAt(i-1)=='0' && str.charAt(i+1)=='0') {
                    char ch='1';
                    str = str.substring(0, i) + ch + str.substring(i + 1);
                    counter++;
                    System.out.println("Changed String of Urinals:" + str);
                }
            }
        }
        return counter;
    }
}
