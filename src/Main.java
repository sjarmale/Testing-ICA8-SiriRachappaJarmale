import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Reading data from urinal.dat file
        System.out.println("Taking input from urinal.dat file");
        File file = new File("urinal.dat");
        Scanner sc= null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Creating output file "rule" / "ruleX.txt"
        String outputFileName = "rule";
        try {
            File myObj = new File(outputFileName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                int counter = 1;
                while (!myObj.createNewFile()) {
                    myObj = new File(outputFileName + counter + ".txt");
                    counter++;
                }
                counter--;
                outputFileName = outputFileName + counter;
                System.out.println("File created: " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }

        // Iterating through the input dat file
        while(sc.hasNextLine()){
            String input= sc.nextLine();
            urinals obj= new urinals();
            Boolean isGoodString = obj.goodString(input);
            if (isGoodString) {
                System.out.println(input + " is a good string.");
            } else {
                System.out.println(input + " is not a good string");
            }
            int freeUrinals = obj.countFreeUrinals(input);
            System.out.println("Number of free urinals: " + freeUrinals);
            try {
                System.out.println(outputFileName + ".txt");
                String addToFile = "\n" + freeUrinals;

                //Adding data to the rule file
                Files.write(Paths.get(outputFileName + ".txt"), addToFile.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("Some error occured");
            }
        }
    }

}