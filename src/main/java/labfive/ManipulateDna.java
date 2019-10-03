package labfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** This class has a method that performs various DNA manipulations.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Janyl Jumadinova
 */

public class ManipulateDna {

  /** The main entry point for ManipulateDNA.
   *  The method reads in user's input as a DNA string.
   *  It then finds the complement and performs random mutations.
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Add Your Name Here " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_input.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // TODO: Read in the DNA from a file using scanner.next() command,
    // save it into a variable and display/print the chosen DNA string in upper case

    // TODO: Compute the complement of the DNA String

    // TODO: Insert a randomly chosen DNA letter into the DNA String at a random position

    // TODO: Delete a DNA letter from a randomly chosen position in the DNA string

    // TODO: Change a random position in the DNA String to a randomly chosen DNA letter

    // TODO: Display a final thank you message

  }

}
