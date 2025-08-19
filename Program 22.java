// Question:
// Write a program to print the length of the entered string.

// Solution:

import java.util.Scanner;
public class MyClass {
public static void main(String[] args) {
String a;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Your Name : ");
      a = scan.nextLine();
System.out.println("The length of the String is: " + a.length());
}
}
