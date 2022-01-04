package sorting;
import java.util.*;
import java.io.*;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		
				System.out.println("Enter "+ n + " elements ");
		     for(int i = 0;i<a.length;i++) {
		    	 a[i]= sc.nextInt();
		     }

		     for(int i =0; i<n-1;i++) {
		    	int min = i;
		     
		     
			for(int j = i+1;j<n;j++) {
			   if(a[j]<a[min]) {
				   min = j;
			   }	
			   
			}
			if(min!=0) {
				int temp = a[min];
				a[min]=a[i];
				a[i]= temp;
				
			}
			
		     }
		     System.out.println("The sorted array is");
		    // for(int i = 0;i<a.length;i++) {
			    	System.out.println(Arrays.toString(a));
			
		    // }
	}

}
