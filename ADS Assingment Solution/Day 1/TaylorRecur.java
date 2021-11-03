
import java.util.*;

class TaylorRecur{


static double recursiveOfSeries(int i, int n, double s)
{	
	
	if (i > n)
		return s;
	else
	{
		
		if (i % 2 == 0)
			s = s - (double)1 / i;
		else
			s = s + (double)1 / i;
			
		return recursiveOfSeries(i + 1, n, s);
	}
}

public static void main(String[] args)
{
	 Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
 
        double res=recursiveOfSeries(1,n,0);
        System.out.println(res);
}
}


