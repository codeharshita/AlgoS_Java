package sorting;
import java.util.*;
import java.io.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int n = sc.nextInt();
	    int [] arr = new int[n];
		
		System.out.println("Enter the " + n + " elements");
		for(int i = 0; i<arr.length; i++) {
		arr[i]= sc.nextInt();
		}
		
		for (int i = 0; i<arr.length-1; i++)
		{
			for(int j =0; j<arr.length-1-i; j++) 
			{
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
					
			
		}
		
		System.out.println("The sorted array using bubble sort is:");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + ',');
			}
		
	}

}
