package array;

public class transpose_arr {

	public static void main(String[] args) {
		
/*to transpose a matrix ,we know after transposing diagonal elements will remain same,so dont touch them
To tanspose just change "i=row " to "j=column".......if we target lower triangular method then our work
will be done i.e. is if we take(1,0)->(0,1) means element at 1 will be put of zero and element on 1 will
be put on 0.
[2, 3 , 4]        [2 , 3 , 3]
[3 , 3, 6] ----->[3,  3 , 5]
[3,  5, 6]       [4,  6 , 6]
*/
int arr[][]= { {1,3,5},
		        {2,4,5},
		        {3,4,5}
		      };
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<i;j++)
	{
		int temp =arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}

}
for(int k =0;k<arr.length;k++)
{
	for(int q=0;q<arr.length;q++)
	{
	System.out.print(arr[k][q]);
}
	System.out.println();
}	
	}

}
