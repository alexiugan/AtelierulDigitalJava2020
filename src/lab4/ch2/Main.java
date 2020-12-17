package lab4.ch2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    static String text="";
    static String result="";

    public static void main(String[] args) {
        try {
            String c;
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("./src/lab4/ch2/message.txt")));

            while(scanner.hasNext())
            {
                c= scanner.next();
                text += c;
            }

            for(int i =0; i<text.length();i++)
            {
                if(Character.isUpperCase(text.charAt(i)))
                {
                    if(text.charAt(i) == 'X')
                        result+= ' ';
                    else
                        result += text.charAt(i);
                }
            }

            System.out.println(result);
        } catch(FileNotFoundException e){
            System.out.println("not found");
        }
    }
}
