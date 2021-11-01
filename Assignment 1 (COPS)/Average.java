
//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 


import java.util.*;
class Average{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("First no. =");
double a = sc.nextDouble();
System.out.print("Second no. =");
double b = sc.nextDouble();
System.out.print("Third no. =");
double c = sc.nextDouble();
System.out.println("Average =" +((a+b+c)/3));
}
}