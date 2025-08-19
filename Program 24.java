// Question:
// Write a program to find square of a number using method.

// Solution:

import java.util.Scanner;
public class MyClass {
public static void main(String[] args) {
int x;
Scanner scan = new Scanner(System.in);
System.out.println("Enter any number: ");
x = scan.nextInt();
System.out.println("Square of the number = " + square (x));
}
public static int square (int x){
return x*x;
}
}