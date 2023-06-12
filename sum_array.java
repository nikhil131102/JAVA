package array;

import java.util.Scanner;

public class sum_array {

	public static void main(String[] args) {
		int[][] arr1=new int[2][2];
		//arr1[0][0]=10;
		//arr1[1][1]=20;
		
		//System.out.println(arr1[0][0]);
		
		//row count
		System.out.println(arr1.length);
		
		//column count
		System.out.println(arr1[0].length);
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				System.out.println("element at row "+i+" at column "+j);
				arr1[i][j]=sc.nextInt();
			}
		}
	for(int y=0;y<arr1.length;y++)
	{
		for(int z=0;z<arr1[0].length;z++)
		{
			System.out.print(arr1[y][z]);
			
		}
	System.out.println();
	}
	}
}
