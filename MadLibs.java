import java.util.Scanner;
/**
 * Write a description of class MadLibs here.
 * A program for MadLibs
 * @Jeeva Rajkumar
 * @9/16/22
 */
public class MadLibs
{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String Name = input.nextLine();
    input.nextLine();
    System.out.print("Enter the date: ");
    String Sdate = input.nextLine();
    
 System.out.print("Enter an adjective: ");
	String adj1 = input.nextLine();
	System.out.print("Enter an adjective: ");
	String adj2 = input.nextLine();
	System.out.print("Enter a type of bird: ");
	String bird1 = input.nextLine();
	System.out.print("Enter a room in a house: ");
	String room1 = input.nextLine();
	System.out.print("Enter a verb(past tense): ");
	String verb1 = input.nextLine();
	System.out.print("Enter a verb: ");
	String verb2 = input.nextLine();
	System.out.print("Enter a relative's name: ");
	String name1 = input.nextLine();
	System.out.print("Enter a noun: ");
	String noun1 = input.nextLine();
	System.out.print("Enter a liquid: ");
	String liquid1 = input.nextLine();
	System.out.print("Enter a verb ending in -ing: ");
	String verb3 = input.nextLine();
	System.out.print("Enter a part of the body(plural): ");
	String bodypart1 = input.nextLine();
	System.out.print("Enter a plural noun: ");
	String noun2 = input.nextLine();
	System.out.print("Enter a verb ending in -ing: ");
	String verb4 = input.nextLine();
	System.out.print("Enter a noun: ");
	String noun3 = input.nextLine();
	System.out.println();
	
	System.out.println(Name);
	System.out.println(Sdate);
	System.out.println("it was a "+adj1+", cold November day. I");
	System.out.println("woke up to the "+adj2+" smell of "+bird1);
	System.out.println("roasting in the "+room1+" downstairs. I");
	System.out.println(verb1+" down the stairs to see if I could");
	System.out.println("help "+verb2+" the dinner. My mom said,");
	System.out.println("'See if "+name1+" needs a fresh "+noun1+".' So I");
	System.out.println("carried a tray of glasses full of "+liquid1+" into");
	System.out.println("the "+verb3+" room. When I got there, I");
	System.out.println("couldn't believe my "+bodypart1+"! There were");
	System.out.println(noun2+" "+verb4+" on the "+noun3);
    }
}
