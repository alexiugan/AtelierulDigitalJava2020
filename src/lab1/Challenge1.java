package lab1;

import java.time.Duration;
import java.time.Instant;

public class Challenge1 {

    public static void main(String[] args) {
        System.out.println("Challenge 1");

        challengeOne();

        System.out.println("\nChallenge 2");

        System.out.println(compute2(10101));

        System.out.println("Challenge 3");

        int [] arr = {3, 2, -3, -2, 3, 0};
        System.out.println(pairOfTwo(arr));

        System.out.println("Challenge 4");
        int [] arr2 = {-1,-1,-1,2};
        System.out.println(pairOfThree(arr2));


        System.out.println("\n\n\n\n");
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1.equals(i2));
        System.out.println(i1==i2);

        Instant start1 = Instant.now();
        for(int i= 0; i<10000000; i++);
        Instant stop1 = Instant.now();
        Duration duration1 = Duration.between(start1, stop1);
        System.out.println("Using primitives: " + duration1);


        Instant start2 = Instant.now();
        for(Integer i= 0; i<10000000; i++);
        Instant stop2 = Instant.now();
        Duration duration2 = Duration.between(start2, stop2);
        System.out.println("Using wrapper: " + duration2);
    }

    public static void challengeOne(){
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("FizzBuzz, ");
            else if (i % 3 == 0)
                System.out.print("Fizz, ");
            else if (i % 5 == 0)
                System.out.print("Buzz, ");
            else if(i % 7 == 0)
                System.out.print("Rizz, ");
            else if(i % 11 == 0)
                System.out.print("Jazz, ");
            else
                System.out.print(i + " ");
        }
    }

    public static String compute(int n){
        String result = "";

        if(n%3==0)
            result+="Foo";
        if(n%5==0)
            result+="Bar";
        if(n%7==0)
            result+="Qix";

        String nr = n + "";
        for(int i =0; i< nr.length(); i++)
        {
            if(nr.charAt(i) == '3')
                result+="Foo";
            else if(nr.charAt(i) == '5')
                result+="Bar";
            else if(nr.charAt(i) == '7')
                result+="Qix";

        }

        if(result.isEmpty())
            result+= n+"";

        return result;
    }

    public static String compute2(int n){
        String result = "";

        if(n%3==0)
            result+="Foo";
        if(n%5==0)
            result+="Bar";
        if(n%7==0)
            result+="Qix";

        String nr = n + "";
        for(int i =0; i< nr.length(); i++)
        {
            if(nr.charAt(i) == '0')
                result+='*';
            else if(nr.charAt(i) == '3')
                result+="Foo";
            else if(nr.charAt(i) == '5')
                result+="Bar";
            else if(nr.charAt(i) == '7')
                result+="Qix";
        }
        if(result.isEmpty())
            result+= n+"";
        return result;
    }


    public static int pairOfTwo(int[] arr){
        int size = arr.length;
        int[] usedNrs = new int[size];
        int pairs = 0;

        for(int i =0; i< size; i++)
            usedNrs[i] = 0;

        for(int i =0; i<size;i++)
        {
            for(int j =0; j<size; j++)
            {
                if((arr[i]+arr[j]==0) && (i!=j) && (usedNrs[i]!=-1) && (usedNrs[j]!=-1))
                {
                    pairs++;
                    usedNrs[i] = -1;
                    usedNrs[j] = -1;
                }
            }
        }
        return pairs;
    }


    public static int pairOfThree(int[] arr){
        int size = arr.length;
        int[] usedNrs = new int[size];
        int pairs = 0;

        for(int i =0; i< size; i++)
            usedNrs[i] = 0;

        for(int i =0; i<size;i++)
        {
            for(int j =0; j<size; j++)
            {
                for(int k=0; k<size; k++)
                {
                    if((arr[i]+arr[j]+arr[k]==0) && (i!=j) && (i!=k) && (j!=k) && (usedNrs[i]!=-1) && (usedNrs[j]!=-1) && (usedNrs[k]!=-1))
                    {
                        pairs++;
                        usedNrs[i] = -1;
                        usedNrs[j] = -1;
                        usedNrs[k] = -1;
                    }
                }
            }
        }
        return pairs;
    }
}