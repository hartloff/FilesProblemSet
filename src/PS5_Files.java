import java.util.ArrayList;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class PS5_Files {




    static ArrayList<String> Q1(String filename){
        // Return all lines of the file in an ArrayList with 1 String for each line in the file

        return null;
    }


    static int Q2(String filename){
        // return the number of lines in the input file

        return 0;
    }


    static double Q3(String number){
        // Return the double represented by the input String. You can assume the String contains a well-formed double.

        return 0.0;
    }


    static int Q4(String filename, char letter){
        // return the number of times letter appears in the input file

        return 0;
    }


    static boolean Q5(String filename){
        // return true if the file can be successfully opened, false otherwise. Hint: If the file cannot be opened, an
        // IOException will be thrown.

        return false;
    }


    static String Q6(String line){
        // Given a line containing comma-separated values, return the second value.

        return "";
    }


    static int Q7(String line){
        // Given a line containing comma-separated values, return the second value as an int. You can assume the second
        // value is a well-formed integer.

        return 0;
    }


    static ArrayList<Integer> Q8(String filename){
        // Read the file to populate an ArrayList of Integers and return the ArrayList. Each line of the file will
        // contain a well-formed integer.

        return null;
    }


    static ArrayList<String> Q9(String line){
        // Given a line containing comma-separated values, return an ArrayList of Strings containing each value in the
        // line separately. Example: Given "comma,separated,values" return ["comma","separated","values"] as 3 entries
        // in an ArrayList.

        return null;
    }


    static HashMap<String, Integer> Q10(String filename){
        // Read the input file and add an entry into a HashMap for each line. The lines will contain comma separated
        // values with a String then an int (ex: "text,5"). For each line enter the String as the key and the int as
        // a value into the map and return the map.

        return null;
    }


    static ArrayList<String> Q11(String filename){
        // Read the file to populate an ArrayList of Strings and return the ArrayList. The file will be comma separated
        // and only the 2nd value (index 1) is to be added into the ArrayList

        return null;
    }


    static ArrayList<Integer> Q12(String filename){
        // Read the file to populate an ArrayList of Integers and return the ArrayList. Each line of the file will
        // contain comma separated data and only the 3rd value (index 2) is to be added into the ArrayList as Integers.
        // You can assume the 3rd value on each line is a well-formed Integer.

        return null;
    }


    static void Q13(String filename, String data){
        // create a new file named filename and write the contents of data into it

    }


    static void Q14(String filename, String data){
        // append the contents of data to the end of filename. You can assume a file named filename already exists

    }


    static void Q15(String inputFilename, String outputFilename){
        // read every line in inputFilename and write it to a file named outputFilename (make a copy of the file)

    }



    public static void main(String[] args) {
    	    // sample usage
    	    System.out.println(Q1("data/test0.txt"));
    }

}
