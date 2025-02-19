
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 */

import javax.swing.*;

public class Histogram {


   // main method begins execution of Java application
   public static void main( String args[] )
   {
      //Build an array.
      int []hArray = { 19, 13, 15, 7, 11, 9, 13, 5, 17, 1 };

     //String to hold output
      String output = "Element\tValue\tHistogram";

      // for each array element, output a bar in histogram
      for ( int i = 0; i < hArray.length; i++ ) {
         output +=  "\n" + i + "\t" + hArray[ i ] + "\t";

         // print bar of asterisks
         for ( int stars = 0; stars < hArray[ i ]; stars++ )
            output += "/./";
      }
      //Create a new text area object to hold the text
      JTextArea outputArea = new JTextArea();
      outputArea.setText( output );

      JOptionPane.showMessageDialog( null, outputArea,
         "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );

   }
}