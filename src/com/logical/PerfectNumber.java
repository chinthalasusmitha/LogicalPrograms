package com.logical;
 import java.util.Scanner;
public class PerfectNumber {
    // Program to find the perfect number in Java
        public static void main(String[] args)
        {
            //Take input from the user
            //Create instance of the Scanner class
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            if (checkPerfect(num))
            {
                System.out.print(num+" is a perfect number ");
            }
            else
            {
                System.out.println(num+" is not a perfect number ");
            }

        }
        static boolean checkPerfect(int num)
        {
            // To store sum of divisors
            int sum = 1;

            // Find all divisors and add them
            for (int i = 2; i * i <= num; i++)
            {
                if (num % i==0)
                {
                    if(i * i != num)
                        sum = sum + i + num / i;
                    else
                        sum = sum + i;
                }
            }
            // If sum of divisors is equal to number
            // Then number is a perfect number
            if (sum == num && num != 1)
                return true;

            return false;
        }
    }

