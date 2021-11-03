import java.util.*;
class SearchEle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("----*****-----");
		int arr[] = new int[size];
		int i = 0;
		int OutPut= 0;
		for(i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		 System.out.println("-----****------");
		int x = sc.nextInt();
		for(i=0;i<size;i++){
			
		if(x==arr[i]){
			OutPut = i;
			break;
		}
		else if(x!=arr[i]){
           OutPut = -1;
		}
		
		}
		System.out.println(OutPut);
		
		
	}
}