class RecurFibonnaci
{
	public int fiborecur(int r) {  // 5
		if (r == 1) return 1;
		if (r == 0) return 1; 
		return fiborecur(r-1)+fiborecur(r-2);
	}
	public int fiboiter(int r) {

		int a, b, i;
 		a = 1; b = 1; 
		for (i = 2; i <= r; i++)
 		{ 
			int n = a+b; 
			a = b;
 			b = n;
		}
	        return b;
	}

public static void main(String[] args) { 
	RecurFibonnaci f = new RecurFibonnaci();
	 int n = Integer.parseInt(args[0]); 
	System.out.println(n); 
	System.out.println("Recursion " + f.fiborecur(n)); 
	System.out.println("Interation " + f.fiboiter(n));
	
}
}