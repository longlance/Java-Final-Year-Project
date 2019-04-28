/*
Program Name: Project Exercise2

Variables/Types: List variables and types here

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class BigNumber{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
    //Add code here for Inputs, if/else statements, while loops

	int number = 0;

		System.out.println("Enter a number: ");
		number = input.nextInt();

	if(number<1000000){
			System.out.println("That is a big number ");
	}
  }
}