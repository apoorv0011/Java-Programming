// Question:
// Write a program such that a Switch (case) allows to make a decision from the number of choices, i.e., from the number of cases.

// Solution:

public class MyClass {
public static void main(String[] args)throws Exception {
char ch;
System.out.print("Enter a character:");
ch = (char)System.in.read();
switch(ch)
{
case 'R':
System.out.print("Red");
break;
case 'W':
System.out.print("White");
break;
case 'Y':
System.out.print("Yellow");
break;
case 'G':
System.out.print("Green");
break;
default:
System.out.print("Error");
break;
}
}
}