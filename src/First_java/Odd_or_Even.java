package First_java;

import java.util.Scanner;

//1. Write a program to print whether a number is even or odd, also take input from the user.

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        if(n%2 == 0){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd");
        }
    }
}
