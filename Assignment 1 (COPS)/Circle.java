
/*11. Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/



import java.util.*;
class Circle{
public static void main (String args[])
{
double radius;
System.out.println("Enter the radius");
Scanner sc = new Scanner(System.in);
radius = sc.nextDouble();
double peri = 2 * 3.14 * radius ;
System.out.println("The cir =" +peri);
double area = 3.14 * radius * radius;
System.out.println("The area =" +String.format("%.10f", area));

}
}