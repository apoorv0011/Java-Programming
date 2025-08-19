// Question:
// Write a program to print the output:
// body [b] = b
// body [o] = o
// body [d] = d
// body [y] = y

// Solution:

public class MyClass {
public static void main(String[] args) throws Exception{
int i;
char [] body = {'b', 'o', 'd', 'y'};
for(i=0; i<4; i++)
System.out.println("body [" + body [i] + " ] = " + body [i]);
}
}
