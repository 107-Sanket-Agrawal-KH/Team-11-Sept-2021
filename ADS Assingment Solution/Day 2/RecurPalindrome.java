import java.util.*;
class RecurPalindrome{
static int rev(int n, int temp)
{
    if (n == 0)
        return temp;
    temp = (temp * 10) + (n % 10);
    return rev(n / 10, temp);
}
public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int temp = rev(x, 0);
     
    if (temp == x)
        System.out.println("Is Palindrome");
    else
        System.out.println("Is not Palindrome" );
}
}
 