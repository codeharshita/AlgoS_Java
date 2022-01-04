//Binary search is one of the searching techniques.
//It is applied only on sorted array
//The searching technique follows divide and conquer strategy and search the space always reduces to half in every iteration
//This is a very efficient technique for searching but it needs some order on which partition of the array will occur.

package sorting;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key, int beg, int end) {
		int mid = (beg + end)/2;
		if(beg <= end) {
			if(key == arr[mid]) {
				return mid;}
			if(key < arr[mid])
				return binarySearch(arr,key,beg, mid-1);
			else
				return binarySearch(arr, key, mid+1, end);
				
			}
		return -1;
			
		}
	
	
	public static void main(String[] args) {
		int [] arr = new int[] {1, 4,5,7,8,65} ; 
		int index = binarySearch(arr, 65, 4,arr.length-1);
		    if(index == -1 ) {
		    	System.out.println("Element not found in the given array");
		    }else
		    	System.out.println("Element found at index" + " "+ index);
		

	}

}
