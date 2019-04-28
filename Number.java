/*
Program Name: Project Exercise3

Variables/Types: List variables and types here

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: none*/

//uncomment next line if input required
 import java.util.Scanner;

public class Number{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
    //Add code here for Inputs, if/else statements, while loops


	int x;


	System.out.print("Enter a Numer:");
	x = input.nextInt();

	if(x >0){
		System.out.println("Number you entered is Positive");
	}
	if(x < 0){
		System.out.println("Number you entered is Negative");
	}

  }
}