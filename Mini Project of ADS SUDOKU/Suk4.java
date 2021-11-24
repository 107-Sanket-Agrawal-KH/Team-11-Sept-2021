//package mypack;
import java.util.*;
 class Suduko {
	 public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";	
	 static int row =3;
	static int col =3;
	static int arr[][] = new int[row][col];
	static boolean solveSuduko(int arr1[][], int row, int col,int num)
	{
			if (isCondition(arr1, row, col, num)) {
				arr1[row][col] = num;
					return true;
			}
		return false;
	}
	
	static boolean isCondition(int[][] grid, int row, int col,int num)
	{
		for (int x = 0; x <= 2; x++){
			if (grid[row][x] == num)
			{
				return false;
			}
		}

		for (int x = 0; x <= 2; x++){
			if (grid[x][col] == num)
			{
				return false;
			}
		}
		return true;
	}
	
	static void loop(int array[][]){
		
		System.out.println(ANSI_RED+"\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+ANSI_RESET);
        System.out.println(ANSI_GREEN+"   "+"--------------------------"+ANSI_RESET);
        
		for(int i=0;i<row;i++){
			int k = i+1;
         System.out.print(ANSI_RED+k+ANSI_RESET+ANSI_GREEN+"   |   "+ANSI_RESET);
	    for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+ANSI_GREEN+"   |   "+ANSI_RESET);
	    }
	        System.out.println();
	        System.out.println(ANSI_GREEN+"   "+"--------------------------"+ANSI_RESET);
        }
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		arr[0][0] = 4;
	    arr[1][2] = 9;
	    arr[2][0] = 8;
	    arr[2][2] = 2;
	    
		System.out.println("WELCOME TO SUDOKU !!!");
		System.out.print("Enter Players Name : ");
		String str = sc.nextLine();
        Suduko.loop(arr);
		L1 : for(int i = 0;i<15;i++){
			System.out.print("Enter Row No. = ");
			int x = sc.nextInt();
			System.out.print("Enter COLOUMN No. = ");
            int y = sc.nextInt();
		if(((0!=x-1)||(0!=y-1))&& ((1!=x-1)||(2!=y-1))&&((2!=x-1)||(0!=y-1))&&((2!=x-1)||(2!=y-1)))
	    {
			for(int a = 0;a<15;a++){//
				
		System.out.print("["+x+"]["+y+"] = ");
			int num = sc.nextInt();
			if(num<10){
		if (solveSuduko(arr, x-1, y-1,num)){
			CleanScrn.clearScreen();
            Suduko.loop(arr);
			break;
		}
		else{
			System.out.println("Invalid Input");
             continue L1;			
		}
		}
		
		else{
			System.out.println("Kindly put input less than 10");
		}
       //	System.out.println("Invalid Input");
		}
		}
		else{
			System.out.println("Already Value Inserted BY CPU");
		}
		}
		
	}
}
class CleanScrn {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
