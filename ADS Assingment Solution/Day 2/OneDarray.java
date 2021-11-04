/*
A]Write a program to create one Dimension Array and perform
1)Insertion of element
2)Deletion of element
3)Search a particular element in array
4)Find sum of elements in array
5)Display elements of array in reverse manner
6)Merge 2 array and display 
7)Copy one array to another
*/
import java.util.*;
class OneDarray{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int size = sc.nextInt();
       	int arr[] = new int[size];
		int i = 0;
		System.out.println("Insertion of element in arr");
		for(i=0;i<size;i++){//Insertion of element
			arr[i]=sc.nextInt();
		}
		System.out.print("Particular element in array i.e index = ");
		System.out.println(arr[sc.nextInt()]);
		int sum = 0;
		for(i=0;i<size;i++)//Find sum of elements in array
        {		
		    sum = sum+arr[i];
        }
		System.out.println("Sum of elements in array arr = "+sum);
		//Display elements of array in reverse manner
		System.out.println("Array in reverse manner");
		for(i=(size-1);i>=0;i--)
		{
        	System.out.println(arr[i]);
        }
		int j =0;
		System.out.println("Insertion of element in arr1");
        int arr1[] = new int[size];
		for(j=0;j<size;j++)
		{	
        	arr1[j]=sc.nextInt();
        } 
		//Merge 2 array and display 
		int k =0;
		j=0;
		System.out.print("Merge array aar & arr1 = ");
		int arr2[] = new int[size*2];
		for(k=0;k<size*2;k++){
			if(k<size){
				arr2[k]=arr[k];
			System.out.print("  "+arr2[k]);
			}
			else{
				arr2[k]=arr1[j];
			System.out.print("  "+arr2[k]);
                j++;			
			}
		}
		System.out.println("");
	           //Copy one array to another
			   System.out.println("Copy of arr1 into arr");
			   for(i=0,j=0;i<size;i++,j++){
				   arr[i]=arr1[j];
				   System.out.println(arr[i]);
		}
	}
}