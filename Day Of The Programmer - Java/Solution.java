import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {

        if(year <= 1917){ //julian calendar
            if((year % 4) == 0){
                return "12.09." + year;   
            }
            else {
                return "13.09." + year;
            }
        }
        else if (year >= 1919) { //gregorian calendar
            if(((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0)){
                return "12.09." + year;
            }
            else {
                return "13.09." + year;
            }
        }
        else {
            return "26.09." + year;
        }


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
