import java.util.Scanner;

//Julian Rocklein
//AP Computer Science
//11/7/2020
public class Lab2 {
  public static void main (String[] args){
        System.out.println("Enter Word:"); // Prints question for original word
        Scanner scanner = new Scanner(System.in); //Creates variable by input
        String answer = scanner.nextLine(); //Makes variable the next thing typed
        
        int length = answer.length(); //Makes a variable number the lenght of the input
        int fHalf = length/2; //Makes variable equal to lenght of word divided by 2

        String firstHalf = answer.substring(0, fHalf); //makes variable just the first half of word
        String secondHalf = answer.substring(fHalf, length); //makes variable just the second half of word

        System.out.print(secondHalf); // Prints second half
        System.out.print(firstHalf); // Prints first half
        System.out.println("  ");

        System.out.println("""
             __
        (___()'`;
        /,     /
        \\\"--\\\
        """);

        scanner.close(); // Closes scanner

        //Challenge 1 helped me work with variables and basic math equation
        //Chellenge 2 helped me with seperating common command icons from strings




    }
}