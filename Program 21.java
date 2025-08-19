// Question:
// Write a program to print the factorial of the entered number.

// Solution:

import java.util.Scanner;
public class MyClass {
public static void main(String []args){
int i, n, fact=1 ;
Scanner scan = new Scanner(System.in);
System.out.println("Enter any number:");
n = scan.nextInt();      
for(i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
     }
}