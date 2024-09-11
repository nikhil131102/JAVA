package array;

public class rotate_90 {

	public static void main(String[] args) {
/*
 step 1-> transpose of a matrix.......
 Step 2 -> Reverse of each row....... 
 */
int arr[][]= { {1,3,5},
		        {2,4,5},
		        {3,4,5}
		      };

//Step 1 tarnspose.....
for(int i=0;i<arr.length;i++)
{
	for (int j=0;j<i;j++)
	{
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}
	
}
System.out.println("Transpose matrix..................");
System.out.println();
System.out.println();
for(int k =0;k<arr.length;k++)
{
	for(int w =0;w<arr.length;w++)
	{
System.out.print(arr[k][w]+" ");	
}
System.out.println();
}

//reverse 
System.out.println("ROTAION OF 90 degreee");
System.out.println();
for(int z=0;z<arr[0].length;z++)
{
	int a=arr[0].length-1;
	while(a>=0) 
	{
		System.out.print(arr[z][a] + " ");
		a--;
		
	}
	System.out.println();
}

	}

}
