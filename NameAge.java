/*
Program Name: Project Excerise 5

Variables/Types: List variables and types here

Inputs: yes

If/else statements: no

Loops: yes

Loop how many times: fixed */

//uncomment next line if input required
 import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){

    //uncomment next line if input required
     Scanner input = new Scanner(System.in);
	 
	  int age=0;
    String name="";
    int counter = 1;
    
    //Declare variables/types
    //Add code here for Inputs, if/else statements, while loops
	
	System.out.println("Enter your Name: ");
    name=input.nextLine();


    System.out.println("enter your age: ");
    age=input.nextInt();

    while (counter <=age){
		System.out.println(counter+"."+name);
		counter =counter+1;
	}
    
  }
}