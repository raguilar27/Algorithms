import static java.lang.Math.*; //allows you to bypass the Math prefix
import java.util.*;
import java.lang.System;//enables console object
import java.nio.file.Paths;
import java.io.Console;
public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We will not use hello world");
		// used for single line comments
		/* used for longer comments
		 * that might need more than one line
		 */
		/**
		 * This is for documentation when writing paragraphs about what each class can do and its specifications.
		 * ex: The Barrett M82A1, standardized by the U.S. military as the M107,
		 *  is a recoil-operated, semi-automatic anti-materiel sniper system developed by the American Barrett Firearms Manufacturing company. 
		 *  Despite its designation as an anti-materiel rifle, it is used by some armed forces as an anti-personnel system.
		 *  The M107 variant is also called the Light Fifty for its .50 BMG (12.7�99mm NATO) chambering and significantly lighter weight compared to previous applications and the 15% heavier base M82 model.
		 *  [1][2] The weapon is found in three variants, the original M82A1 (and A3), the bullpup M82A2 and Barrett M107A1 with muzzle brake designed to accept a suppressor and made out of titanium instead of steel. 
		 *  The M82A2 is no longer manufactured, though the XM500 can be seen as its successor.
		 */
		
		System.out.println(0b1101); //prints out binary numbers if you add 0b infront of the binary number
		System.out.println(1_000_000); //you can add underscores to numbers to make it easier to read because java compiler simply removes them
		System.out.println(0b1111_0100_0010_0100_0000); //it also works with binary numbers as well
		
		double w = 46.7;
		if (Double.isNaN(w)) { // checks whether x is "not a number"
			System.out.println("is not a number");
		}else {
			System.out.println(w + " is a number");
		}
		
		int i, j; //both are declared as variables
		// This style isn't recommended because if you declare each variable separately, your programs will be easier to read
		
		//if you can't think of a different variable name try this---------------------------------------
		
		//Box box; //"Box" is the type and "box" is the variable name
		//Box aBox; // or this can work as well
		
		/**
		 * WAYS OF DECLARING VARIABLES
		 */
		
		int vacationDays;
		vacationDays = 12;
		// In java it is considered good style to declare variable as closely as possible to the point where they are first used
		int summerDays = 12;
		
		/**
		 * USING THE MATH CLASS
		 */
		
		//Taking the square root of a number
		double x = 4;
		double y = Math.sqrt(x);
		System.out.println(y); //prints 2.0
		
		//raising a quantity to a power
		double q = Math.pow(y, x); // this means y^x
		System.out.println(q);//prints 16.0
		
		//remainders with negative numbers ex: adjusting a clock
		int position = 3; 
		int adjustment = -6;
		double time = Math.floorMod(position + adjustment, 12); //allows you to calculate the remainder of a negative number
		System.out.println(time);
		
		//Trigonometric features
		Math.sin(x);
		Math.cos(x);
		Math.tan(x);
		Math.atan(x);
		Math.atan2(y, x);
		
		Math.exp(x); //exponential function with its inverse
		Math.log(x); //natural logarithm
		Math.log10(x); //decimal logarithm
		
		//two constants that denote the closest possible approximations to the mathematical constants pi and e
		//Math.PI;
		//Math.E;
		//you can avoid the Math prefix by adding the import method on the top of your source file
		
		/**
		 * CONVERSIONS BETWEEN NUMERIC TYPES
		 *  byte -> short -> int -> long
		 *  char -> int
		 *  float -> double
		 *  int -> double
		 * are all conversions without information loss
		 *  
		 *  int -> float
		 *  long -> float 
		 *  long -> double
		 * are all conversions that may lose precision 
		 */
		
		int n = 123456789;
		float f = n; //f is 1.23456792E8
		System.out.println(f);
		
		/**
		 * CASTS
		 */
		double z = 9.997;		
		int nx = (int) z; // nx has value 9 because casting a floating-point value to an integer discards the fractional part
		System.out.println(nx);
		
		//if you want to round a floating-point number to the nearest integer use Math.round method
		double k = 9.997;
		int re = (int) Math.round(k); // re has value 10
		System.out.println(re);
		
		/**
		 * COMBINING ASSIGNMENTS WITH OPERATORS
		 */
		//In general place the operator to the left ex: *= or %=
		x += 4; // x = x + 4
		
		x += 3.5; //(int)(x + 3.5)
		
		/**
		 * INCREMENT AND DECREMENT OPERATORS
		 */
		//increments the value of g by 1
		int g = 12;
		g++; //g = 13
		
		int u = 7;
		int c = 7;
		int r = 2 * ++u; //now r is 16, u is 8
		int l = 2 * c++; //now l is 14, n is 8
		//Recommended against using ++ inside expressions because this often leads to confusing code and annoying bugs
		
		/**
		 * RELATION AND BOOLEAN OPERATORS
		 */
		//Testing for equality
		if(u != c && r != l) { //using && and || is called short circuit, which is when java checks to see if the first expression is true or false
			//so for this ex. since u!=c is false it doesn't check the second expression because the && operator requires both expressions to be true
			System.out.println("false");
			}
		else {
			System.out.println("true");
		}
		
		/*if (checkAdjustHeart() & checkAdjustLung()) {
			 System.out.println("Both monitors are OK");
			}
			You may want to force Java to call both methods, even if the first method returns a false ("not OK")
			result. The && operator's short circuit evaluation doesn't always call both methods. So in this scenario,
			you use the & operator to see which method needs to be corrected
		 */
		
		/*TERNARY - condition ? expression1 : expression 2
		if the condition is true, then expression1 is chosen otherwise it is expresson2
		the conditional operator's most common usage is to make a terse simple conditional assignment statement. 
		For example, if we wish to implement some code to change a shop's normal opening hours from 9 o'clock to 12 o'clock on Sundays, we may use
		*/
		int day = 7;
		int SUNDAY = 7;
		
		int opening_time = (day == SUNDAY) ? 12 : 9;
		
		/*instead of the more verbose
		int opening_time;

		if (day == SUNDAY)
		    opening_time = 12;
		else
		    opening_time = 9;
		*/
		
		/**
		 * ENUMERATED TYPE
		 */
		Size m = Size.MEDIUM; // declared at the bottom of the class
		
		/**
		 * STRINGS AND SUBSTRINGS
		 */
		String e = "";//empty string
		String greeting = "Hello";
		String s = greeting.substring(0,3);
		System.out.println(s);//prints out Hel
		
		/**
		 * CONCATENATION - COMBINING TWO STRINGS
		 */
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + PG13;
		System.out.println(message);
		
		/***
		 * STRINGS ARE IMMUTABLE
		 */
		//if you want to modify a current string you can use a substring with concatenation
		greeting = greeting.substring(0,3) + "p!";//changes Hello! to Help!
		System.out.println(greeting);
		/**
		 * TESTING STRINGS FOR EQUALITY
		 */
		//the expression returns true if the strings s and t are equal, false otherwise
		String ss = "car";
		String gt = "car";
		ss.equals(gt);
		//or
		"car".equals(ss);
		//and if you want to compare two strings but don't know if there's a difference in upper/ lowercase letter distinction
		"Hello how are you".equalsIgnoreCase("hello how are you");
		/*This is similar to strcmp in c++
		if (greeting.compareTo("Hello") == 0) but for java it is recommended to use equals instead*/
		/**
		 * EMPTY AND NULL STRINGS
		 */
		//you can test if a string is empty by calling
		if(ss.length() == 0) {
			//or if(str==null)
		}
		// or
		if(gt.equals("")) {
			
		}
		//also to test if a string is neither null nor empty 
		if (ss != null && ss.length() != 0) {
			
		}
		
		/**
		 * BUILDING STRINGS
		 */
		//Follow these steps to build a string from small pieces 
		StringBuilder builder = new StringBuilder();
		//each time you need to add apart call the method append method
		char ch = 'c';
		String str = "word";
		builder.append(ch);//appends a single character
		builder.append(str);//appends a string
		//when finished building a string, call toString method. You will get a String object with the character sequence contained in the builder
		String completedString = builder.toString();
		
		/**
		 * INPUT AND OUTPUT
		 */
		//use import java.util.*; in the beginning to import Scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		//reads a whole line  
		String name = in.nextLine();
		//to read a single word
		//String firstName = in.next();
		System.out.println("what is your age");
		int age = in.nextInt();
		//reads the next integer and use nextDouble to read the next floating-point number
		System.out.println("Hello, " + name + ". Next year you will be "+ (age + 1));
		
		//To read a password 
		/*Console cons = System.console();
		String username = cons.readLine("Username: ");
		char[] password = cons.readPassword("Password: ");*/
		
		/**
		 * FORMATTING OUTPUT
		 */
		double xz = 10000.0/3.0;
		System.out.println(xz); //prints out 3333.333333335
		//if you would like to print out dollars or cents we can use printf
		System.out.printf("%8.2f", xz); //prints out 3333.33
		System.out.println();
		//prints xz with a field width of 8 characters and precision of 2 characters
		System.out.printf("%tc", new Date());// prints out the current date and time in the format ex: Mon Feb 09 18:05:19 PST 2015
		System.out.println();
		//syntax for prinf
		//printf("%argument index $ flag width t(conversion char) .(precision)");
		
		/**
		 * FILE INPUT AND OUTPUT
		 */
		//allows you to write a file
		//PrintWriter out = new PrintWriter("myfile.txt", "UTF-8");
		//allows you to read from a file
		//Scanner on = new Scanner(Paths.get("myfile.txt"), "UTF-8");
		//if filename contains backslashes, remeber to escpae each of them with an additional backslash: "c:\\mydirectory\\myfile.txt"
		//creates error because there is no file named myfile.txt
		//you can temporarily use throws IOException next to (public static void main)
		
		/**
		 * CONTROL FLOW
		 */
		//BLOCKS
		int no;
		{
			int ko;
		}//k is only defined up to here
		
		/*
		  int n; 
		  {
		  	int k;
		  	int n; //Error--can't redefine n in inner block
		  }
		*/
		
		/**
		 * CONDITIONAL STATEMENTS 
		 */
		//for if and else statements. an else groups with the closest if, but it is better to use braces
		
		/**
		 * LOOPS
		 */
		//while loop - while (condition) statement, the while loop will never execute if the condition is false at the outset(start)
		//if you want to make sure the block is at least executed once you should use a do while loop
		// do statement while (condition) - it runs the statement once and if it meets the condition at the bottom it will run again until it no longer meets the condition
		
		/**
		 * DETERMINATE LOOPS
		 */
		//the for loop usually holds the counter initialization in the first slot, the second slot gives the condition that will be tested
		//the third slot specifies how to update the counter
		for (int nm = 0; nm <= 10; nm++) {
			System.out.println(nm);
		}
		//if you declare a variable inside a for statement, you can't use its value outside the loop
		//therefore if you plan to use the final value of a loop counter outside the for loop, be sure to declare it outside the loop header
		int fg;
		for (fg = 0; fg < 12; fg++) {
			System.out.println(fg);
		}
		//fg is still defined here
		//you can define variables with the same name in separate for loops ex: we have used the nm variable before in the first example 
		//but we can use it again because it is only declared in the for loop statement
		for(int nm = 0; nm < 9; nm++) {
			System.out.println(nm);
		}
		
		/**
		 * MULTIPLE SELECTIONS - SWITCH STATEMENTS
		 */
		//If you set up a menu system with four alternatives 
		System.out.print("Select and option (1, 2, 3, 4)");
		int choice = in.nextInt();
		switch(choice) //your choice represents the case number
		{
		case 1: 
			
			break;
		case 2:
			
			break;
		case 3: 
			
			break;
		case 4:
			
			break;
		default:
			//bad input
			break;
		}
		
		/* A case label can be 
		 * A constant expression of type char, byte, short, or int
		 * An enumerated constant 
		 * A string literal
		 */
		System.out.println("Choose a fruit: watermelon, apple, mango");
		String input = in.nextLine();
		switch(input.toLowerCase()) {
		case "watermelon":
			break;
		case "apple":
			break;
		case "mango":
			break;
		default:
			break;
		}
		
		/**
		 * STATEMENTS THAT BREAK CONTROL FLOW
		 */
		/*
		 * label: 
		 * {
		 * 		if(condition) break label; //exits block
		 * }
		 * you can add a label: this will allow you to jump where the break statement executes
		*/
		
		int yoyo = 0;
		
		read_data:
			while (yoyo <= 10 ) { // this loop statement is tagged with the label
				for (int i1 = 0; i1 <= 5; i1++) { //this inner loop is not labeled 
					System.out.print("Enter a number >= 0: ");
					yoyo = in.nextInt();
					if(yoyo < 0) //shouldn't happen - can't go on
						break read_data;
						//break out of read_data loop
				}
			}
		//this statement is executed immediately after the labeled break
		if ( n < 0) { //checks for bad situation
			//deal with bad situation
		}else {
			//carry out normal processing
		}
		
		//Continue allows you to jump immediately to the loop header, skipping the remainder of the current iteration
		/*
		 * for(cout = 1; cout <= 100; cout++){
		 * 		System.out.print("Enter a number, -1 to quit: ");
		 * 		n = in.nextInt();
		 * 		if (n < 0) continue;
		 * 		sum += n; //not executed if n < 0
		 * }
		 * if n < 0, then the continue statement jumps to the count++ statement
		 */
		
		/**
		 * ARRAYS
		 */
		
		
		
		
		
	}
	
	/**Class constants
	 */
	//class constant- the keyword final is a variable that is set to one value and is set once and for all, which is available to the whole class because of the word static 
	//good style to use is to capitalize the whole variable name when using the keyword final
	//the class constant is used outside the main method so other methods from this class can use this variable
	//public allows other classes to use this variable
	public static final double CM_PER_INCH = 2.54;
	
	enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}; //enumerated types of the size of pizza
	
}
