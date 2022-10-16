package com.logical;
//Fibonacci Series
//        Fibonacci series is a special type of series in which the next term is the sum of the
//        previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
//        the next term will be 1(0+1).
    import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String[] args) {
            int my_input , term_1, term_2, term_3;
            term_1 = 0;
            term_2 = 1;
            System.out.println("Required packages have been imported");
            Scanner my_scanner = new Scanner(System.in);
            System.out.println("A reader object has been defined ");
            System.out.print("Enter the number : ");
            my_input = my_scanner.nextInt();
            System.out.println("The fibonacci series till " + my_input + " terms:");
            for (int i = 1; i <= my_input; ++i) {
                System.out.print(term_1 + " ");
                term_3 = term_1 + term_2;
                term_1 = term_2;
                term_2 = term_3;
            }
        }
    }

