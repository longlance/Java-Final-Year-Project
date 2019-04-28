/*
Program Name: Project Excerise4

Variables/Types: List variables and types here

Inputs: yes/no

If/else statements: yes/no

Loops: yes/no

Loop how many times: fixed / unknown / not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Two{
  public static void main(String[] args){

    //uncomment next line if input required

  	Scanner input = new Scanner(System.in);

  	int first = 0;
  	int second = 0;


  	System.out.print("Enter a Number: ");
  		first = input.nextInt();

  	System.out.print("Enter a Number: ");
  		second = input.nextInt();


  		if(first == 2 && second == 2){
			System.out.println("Both numbers are 2");
		}else if( first != 2 && second !=2){
			System.out.println("Neither number 2");
		}else if( first ==2 || second ==2){
				if(second !=2){
					System.out.println("First number is 2");
				}else if(first !=2){
					System.out.println("Second number is 2");
			}
	}


    //Declare variables/types
    //Add code here for Inputs, if/else statements, while loops

  }
}