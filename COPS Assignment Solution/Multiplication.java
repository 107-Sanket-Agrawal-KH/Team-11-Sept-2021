
/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10. 
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80     */

import java.util.*;
class Multiplication{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a;
for(a = 1; a <= 10; a++){
System.out.println("8 * " +a +" = " +(8 * a ));
}
}
}

