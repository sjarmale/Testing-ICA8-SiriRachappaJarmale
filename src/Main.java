import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the input string: ex: 101110");
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        urinals obj= new urinals();
        Boolean isGoodString = obj.goodString(input);
        if (isGoodString) {
            System.out.println(input + " is a good string.");
        } else {
            System.out.println(input + " is not a good string");
        }
    }

}