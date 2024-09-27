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


        //doing the first one
        int openingBracketIndex1 = madLibs.indexOf("<") +1;
        int closingBracketIndex1 = madLibs.indexOf(">");

        
        System.out.println("Enter a " + madLibs.substring(openingBracketIndex1, closingBracketIndex1));
        String userInput = sc.nextLine();

        String sectionMadLib1 = madLibs.substring(0, openingBracketIndex1) + userInput;


        //doing the second one
        int openingBracketIndex2 = madLibs.indexOf("<", openingBracketIndex1 + 1) +1;
        int closingBracketIndex2 = madLibs.indexOf(">", closingBracketIndex1 + 1);

        
        System.out.println("Enter a " + madLibs.substring(openingBracketIndex2, closingBracketIndex2));
        String userInput2 = sc.nextLine();

        String sectionMadLib2 = madLibs.substring(closingBracketIndex1, openingBracketIndex2) + userInput2;

        //doing the third one
        int openingBracketIndex3 = madLibs.indexOf("<", openingBracketIndex2 + 1) +1;
        int closingBracketIndex3 = madLibs.indexOf(">", closingBracketIndex2 + 1);
        int periodLocation = madLibs.indexOf(".");
        
        String madLibUntilEnd = madLibs.substring(closingBracketIndex3, periodLocation);
        
        System.out.println("Enter a " + madLibs.substring(openingBracketIndex3, closingBracketIndex3));
        String userInput3 = sc.nextLine();

        String sectionMadLib3 = madLibs.substring(closingBracketIndex2, openingBracketIndex3) + userInput3;

        String entireMadLib = sectionMadLib1 + userInput + sectionMadLib2 + userInput2 + sectionMadLib3 + userInput3 + madLibUntilEnd;

        System.out.println(entireMadLib);

    }
}
