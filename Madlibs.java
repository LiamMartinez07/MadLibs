import java.util.Scanner;

public class Madlibs
{ 
    public static void main (String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        
        //MadLibs Strings
        String madLibs = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        // madLibs = "Once upon a time in a <adjective> land, a <noun> <adverb> grew";
        // madLibs = "I don't like <noun>, and because I wanted to <verb> I ended up in <noun>.";

        System.out.println("Enter a noun");
        int openingBracketIndex = madLibs.indexOf("<");
        int closingBracketIndex = madLibs.indexOf(">");

        String madLibsOne = madLibs.substring(openingBracketIndex, closingBracketIndex);

        String userInput = sc.nextLine();

        System.out.println(madLibsOne + userInput);



    }
}