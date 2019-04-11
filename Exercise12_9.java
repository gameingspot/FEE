import java.util.HashMap;
import java.util.Scanner;

public class Exercise12_9
{
    public static void main(String[] args)
    {
        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                  "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                  "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                  ",", ".", "?" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
        
HashMap<String, String> morseCode = new HashMap<String, String>();
morseCode.put("a",".-");
morseCode.put("b","-...");
morseCode.put("c","-.-.");
morseCode.put("d","-..");
morseCode.put("e",".");
morseCode.put("f","..-.");
morseCode.put("g","--.");
morseCode.put("h","....");
morseCode.put("i","..");
morseCode.put("j",".---");
morseCode.put("k","-.-");
morseCode.put("l",".-..");
morseCode.put("m","--");
morseCode.put("n","-.");
morseCode.put("o","---");
morseCode.put("p",".--.");
morseCode.put("q","..-.");
morseCode.put("r",".-.");
morseCode.put("s","...");
morseCode.put("t","-");
morseCode.put("u","..-");
morseCode.put("v","...-");
morseCode.put("w",".--");
morseCode.put("x","-..-");
morseCode.put("y","-.--");
morseCode.put("z","--..");
morseCode.put("1",".----");
morseCode.put("2","..---");
morseCode.put("3","...--");
morseCode.put("4","....-");
morseCode.put("5",".....");
morseCode.put("6","-....");
morseCode.put("7","--...");
morseCode.put("8","---..");
morseCode.put("9","----.");
morseCode.put("0","-----");
morseCode.put(",","--.--");
morseCode.put(".",".-.-.-");
morseCode.put("?","..--..");








        Scanner keyboard = new Scanner(System.in);

        String userInput;

        int index;

        index = 0;

        System.out.println(" This is an English to Morse Code Translator.  ");
        System.out.println(" Please enter what you would like translate ");
        System.out.println("             into Morse Code. ");
        System.out.println(" ============================================ ");

        userInput = keyboard.nextLine();

        userInput = userInput.toLowerCase();
        String newmessage = "";

        for (index = 0; index < userInput.length(); index++)           
        {
            newmessage += morseCode.get(String.valueOf(userInput.charAt(index)));         
        } 
  
        System.out.println(" Translated : " + newmessage);}
}