package com.logical;
    import java.util.Scanner;

public class PrimeNumber {
//    // Program to find prime number in Java
//
//        public static void main(String[] args)
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number : ");
//            int num = sc.nextInt();
//            if (checkPrime(num)) {
//                System.out.println(num + " is a prime number");
//            }
//            else
//            {
//                System.out.println(num + " is not a prime number");
//            }
//        }
//        public static boolean checkPrime(int num)
//        {
//            if (num <= 1)
//            {
//                return false;
//            }
//            for (int i = 2; i < Math.sqrt(num); i++)
//            {
//                if (num % i == 0)
//                {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

    public static void main(String args[])
    {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}
