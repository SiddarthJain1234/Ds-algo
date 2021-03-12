package thenewboston;

public class BinarySearch {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {15,25,40,48,56,65};
		int index=binarySearch(a,0,a.length-1,68);
		if(index==296) {
			System.out.print("Item not found");
		}
		else {
			System.out.print("Item found at "+index+" index");
		}
		
		
		
	}
	
public static int binarySearch(int[] a,int low,int high,int item) {
		//base condition
	if(low>high) {
		return 296;
	}
	int middle=(low+high)/2;
	if(item==a[middle]) {
		return middle;
	}
	
	else if(item>a[middle]) {
		low=middle+1;
	}
	
	else {
		high=middle-1;
	}
	
	
	
	
	
	
	return binarySearch(a,low,high,item);
	}	

}
