
//5. Write a Java program that takes two numbers as input and display the product of two numbers. 
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
 import java.util.*;
class Product{
public static void main(String args[]){
	int a,b;
Scanner sc = new Scanner(System.in);
a =sc.nextInt();
System.out.println("First no. =" +a);
Scanner sb = new Scanner(System.in);
b =sc.nextInt();
System.out.println("Second no. =" +b);
System.out.println("Product =" +(a * b));
}
}
