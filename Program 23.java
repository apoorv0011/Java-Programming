// Question:
// Write a program to print the output:
// Einstein [0] = E
// Einstein [1] = I
// Einstein [2] = N
// Einstein [3] = S
// Einstein [4] = T
// Einstein [5] = E
// Einstein [6] = I
// Einstein [7] = N

// Solution:

public class MyClass {
public static void main(String[] args) throws Exception{
int i;
char [] num = {'E' , 'I', 'N', 'S', 'T', 'E', 'I', 'N'};
for(i=0; i<8; i++)
System.out.println("Einstein [" + i + " ] = " + num[i]);
}
}