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

        int openingBracketIndex1 = madLibs.indexOf("<") +1;
        int closingBracketIndex1 = madLibs.indexOf(">");

        // doing the first one
        System.out.println("Enter a " + madLibs.substring(openingBracketIndex1, closingBracketIndex1));
        String userInput = sc.nextLine();

        String madLibsOne = madLibs.substring(openingBracketIndex1, closingBracketIndex1);

        String entireMadLib = madLibs.substring(0, openingBracketIndex1) + userInput;

        int openingBracketIndex2 = madLibs.indexOf("<", openingBracketIndex1 + 1);
        int closingBracketIndex2 = madLibs.indexOf(">", closingBracketIndex1 + 1);

        //doing the second one

    }
}
