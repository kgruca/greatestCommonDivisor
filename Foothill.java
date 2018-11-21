import java.util.Scanner;

public class Foothill
{
   public static void main(String[] args)
   {
      String firstString, secondString;
      int firstInt, secondInt, gcd;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("I will find the GCD of two numbers!\n\n");
      
      System.out.print("Please type in the first number: ");
      firstString = input.next();
      firstInt = Integer.parseInt(firstString); //convert user input to int type
      
      System.out.print("Please type in the second number: ");
      secondString = input.next();
      secondInt = Integer.parseInt(secondString); //convert user input to int type
      input.close();
      
      gcd = computeGcd(firstInt, secondInt);
      
      System.out.print("\nThe greatest common divisor of " + firstString
      + " and " + secondString + " is " + gcd + "!");
   }
   
   // does the actual calculation of the greatest common divisor
   public static int computeGcd(int firstNumber, int secondNumber)
   {
      int greatestCommonDivisor = 1; // every number is divisible by 1
      int lowerNumber; /* with two numbers, we only need the factors
      of the lower number to calculate GCD */
      
      if(firstNumber >= secondNumber)
         lowerNumber = secondNumber;
      else
         lowerNumber = firstNumber;
      
      for(int i = 2; i <= lowerNumber; i++) 
      {
         if((firstNumber % i == 0) && (secondNumber % i == 0))
            greatestCommonDivisor = i;
      }
      
      return greatestCommonDivisor;
   }
}

/* -------------------- paste of run 1 from console window -----------------------

I will find the GCD of two numbers!

Please type in the first number: 31
Please type in the second number: 973

The greatest common divisor of 31 and 973 is 1!

---------------------------------------------------------------------------------*/

/* -------------------- paste of run 2 from console window -----------------------

I will find the GCD of two numbers!

Please type in the first number: 1200
Please type in the second number: 600

The greatest common divisor of 1200 and 600 is 600!

---------------------------------------------------------------------------------*/

/* -------------------- paste of run 2 from console window -----------------------

I will find the GCD of two numbers!

Please type in the first number: 64
Please type in the second number: 72

The greatest common divisor of 64 and 72 is 8!

---------------------------------------------------------------------------------*/