package array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class subarray {

	public static void main(String[] args) {
		System.out.println("Enter no of elements in array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(arr[i]);	
		}
//SUB-ARRAYS (two loops one points and initial and other will prints all elements ahead of current element)
		for(int si=0;si<n;si++)
		{
			for(int ei=si;ei<n;ei++)
			{
				for(int k=si;k<=ei;k++)
				{
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
		
	}

}
