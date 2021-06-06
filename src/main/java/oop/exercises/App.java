/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String input = in.nextLine();
        int count = input.length();

        System.out.printf("%s has %d characters.", input, count);
    }
}
