import java.util.Scanner;
/**
*@author Kevin Tran
*This is a very basic hello world class used as an example
*@param none
*/
public class HelloWorld {
	// This is single comment line
	public static void main (String[] args){
		int myAge = 27;
		char mySex = 'M';
		double myHeight = 5.5;
		String name;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Hello CIS 2323");
		System.out.println("I am " + myAge + " years old.");
		System.out.println("I am a " + mySex + "ale.");
		System.out.println("I am " + myHeight);
		
		/*
		This is a multi-line comment
		*/
		
		System.out.println("What is your name?");
		name = inputDevice.nextLine();
		System.out.println("Hello " + name + " welcome to class.");
	}
}