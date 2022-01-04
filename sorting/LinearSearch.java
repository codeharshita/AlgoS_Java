package sorting;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = new int[] {6,4,7,8,5,2,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		int count=0;
		
		
		for(int i = 0; i< arr.length;i++) {
			if(key == arr[i] ) {
				System.out.println("YOUR ELEMENT IS FOUND AT " +" "+ i +" " + "POSITION OF ARRAY");
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("Element not found");
		}
	}

}


//Time complexity of linear Search:-
//BTC=O(1),ATC=O(N),WTC=O(N)

//No auxiliary space is required in LS ,so space complexity will be O(1).

