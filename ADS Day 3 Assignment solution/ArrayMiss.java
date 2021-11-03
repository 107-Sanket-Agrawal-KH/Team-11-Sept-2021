import java.util.*;
class ArrayMiss{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int i = 0;
		for(i = 0;i<size;i++){
			arr[i]= sc.nextInt();
			}
			for(i = 0;i<size-1;i++)
			{
			if(arr[i+1]==arr[i]+1){}
				else{
					System.out.println(arr[i]+1);
				}		
	        }
	} 
}