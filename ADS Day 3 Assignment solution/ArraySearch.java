class ArraySearch{
	static int arraysearch(int a[]){
		int i = 0;
		for (i = 0;i<9;i++){
			if(a[i]==37)
				break;
		}
	return i;
	}
	public static void main(String[] args){
		int arr[] = {20,35,37,40,45,50,51,55,67};
		System.out.println(ArraySearch.arraysearch(arr));
	}
}