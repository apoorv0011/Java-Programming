// Question 38
// Question:
// Write a program to Count Number of Digits in an Integer.

// Solution:

public class MyClass {

    public static void main(String[] args) {

        int count = 0, num = 3452;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}