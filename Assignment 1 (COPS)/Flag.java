
/*14. Write a Java program to print an American flag on the screen. 
Expected Output*/


class Flag{
public static void main(String args[]){
	for(int a=1;a<=4;a++){
	for(int i =1; i<= 6; i++)
		System.out.print("*  ");
	for(int j=1;j<=25;j++){
	System.out.print("=");
	}
	System.out.println("");
    for(int i =1; i<= 6; i++)
		System.out.print("  *");
	for(int j=1;j<=25;j++){
	System.out.print("=");
	}
	System.out.println("");
	}
	for(int i =1; i<= 6; i++)
		System.out.print("*  ");
	for(int j=1;j<=25;j++){
	System.out.print("=");
	}
	System.out.println("");
	for(int i=1;i<=6;i++){
	for(int j=1;j<=43;j++){
	System.out.print("=");
	}
	System.out.println("");
	}
}
}

