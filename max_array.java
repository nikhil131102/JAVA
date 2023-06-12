package array;

public class max_array {

	public static void main(String[] args) {
		int arr[] = {1,-2,4,5,34,-56,22,4,22,-56};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<=arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println( max);
	}

}
