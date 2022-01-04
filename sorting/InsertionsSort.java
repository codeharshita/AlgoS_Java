package sorting;
import java.util.*;
import java.io.*;

public class InsertionsSort {

	public static void main(String[] args) {
			
		int n,i,j,temp;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		 n = sc.nextInt();
		 int [] a = new int[n];

		 System.out.println("Enter the " + n + " elements");
		 for( i =0; i<a.length; i++) {
			 a[i]= sc.nextInt();
		 }
		 
		 for(i = 0;i <a.length; i++) {
			 temp = a[i];
			 j = i-1;
			
			 while(j>=0 && a[j]>temp) {
				 a[j+1] = a[j];
				 j--;
				}
			 a[j+1] = temp;
		 }
		 
		 System.out.println("The sorted array is");
		 for( i = 0; i<a.length; i++) {
			 System.out.println(a[i]);
		 }
		 
		
		
	}

}
