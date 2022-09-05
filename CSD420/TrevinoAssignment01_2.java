package CSD420;

/*

Samuel Trevino
August 11, 2022
MOD 1 Assignment

Write a program that stores:

- An array of five random integers
- A Data objective instance using the current date
- An array of five random double values

Append the data in a file titled <yourname> datafile.dat.
Write a second program that will read the file and display the data.
 */

import java.io.FileInputStream;
import java.io.IOException;

public class TrevinoAssignment01_2 {

    public static void main (String[]args) throws IOException{

        try{
            FileInputStream fis = new FileInputStream("TrevinoDataFile.dat");

            int i = 0;
            while((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
