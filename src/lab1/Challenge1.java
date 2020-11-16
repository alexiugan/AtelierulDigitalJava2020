package lab1;

public class Challenge1 {

    public static void main(String[] args) {
        System.out.println("Challenge 1");

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("fizzbuzz, ");
            else if (i % 3 == 0)
                System.out.print("fizz, ");
            else if (i % 5 == 0)
                System.out.print("buzz, ");
            else if(i % 7 == 0)
                System.out.print("rizz, ");
            else if(i % 11 == 0)
                System.out.print("jazz, ");
            else
                System.out.print(i + " ");
        }
    }
}