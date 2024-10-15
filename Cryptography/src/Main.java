import java.util.Scanner;

public class Main{
    static String getInput(){
        Scanner user = new Scanner(System.in);
        System.out.print("Type a text: ");
        String data = user.nextLine().toUpperCase().trim(); // -> get a user input.
        user.close();
        return data;// trim() is a method that can remove blank spaces.
    }

    static void crypto()
    {
        String getText = getInput();

        if(getText.isEmpty())
        {
            System.out.println("ERROR! \nPlease trying again!");
            return;
        }

        char[] splittingText = getText.toCharArray(); // toCharArray() transform a string to char[]

        int count = 0;
        for(char letter: splittingText)
        {
            count++;
            int asciiLetter = (int)letter - 64;
            boolean conditionalPoint = count <= splittingText.length - 1;
            System.out.print(asciiLetter + (conditionalPoint ? ".": ""));
        }
    }
    public static void main(String[] args){
        crypto();
    }
}