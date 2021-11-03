
import java.util.*;
class RecurMult{
	
	static int remult(int a, int b){
		if(b>=2){
		remult(a,--b);
		System.out.println(a+" * "+b+" = "+a*b);
		}
		return 1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		remult(sc.nextInt(),11);
	}
}