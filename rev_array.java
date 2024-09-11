package array;

public class rev_array {

	public static void main(String[] args) {
		int arr[]= {1,3,45,6};
		System.out.println("Using for loop");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Using while loop");
		int x=0;
		int y=arr.length-1;
		while(x<y)
		{
			int temp =arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
			x++;
			y--;
		}
		for(int w=0;w<arr.length;w++)
		{
			System.out.println(arr[w]);
		}
	}
	
}