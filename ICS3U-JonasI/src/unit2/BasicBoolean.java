package unit2;

/**
* Description: BasicBoolean worksheet.
* Date: Nov. 4, 2024
* @author Caden Vandeweghe
*/

public class BasicBoolean {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either true or false
    boolean isPurple = false;

    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because firstNum with the value of 5 is less then secondNum with the value of 10 (5 < 10)
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because firstNum with value 5 is less then secondNum with value 10 (5 < 10) but it means that firstNum is greater then secondNum and thst is false
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out true because firstNum is greater than or equal to int thirdNum
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out true because firstNum is less than or equal to thirdNum
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: Greater than
      * < means: Less than
      * <= means: Less than and equal to
      * >= means: Greater than and equal to
      * == means: Equal to
      * != means: Is not equal to
    */

  }
}