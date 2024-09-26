import java.util.Scanner;

public class Madlibs
{ 
    public static void main (String[] args)
    { 
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");

        String userInput = sc.nextLine();

        System.out.println("Your name is " + userInput + "!");

    }
}