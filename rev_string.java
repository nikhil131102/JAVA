package String;
//hello world ---> world hello
public class rev_string {
	public void rev(String s)
	{
		int i=s.length()-1;
	String ans ="";
	while(i>=0)
	{
		while(i>=0 && s.charAt(i)==' ')
		{
			i--;
		}
		int j=i;
		
		while(i<0)
			break;
		while(i>=0 && s.charAt(i)!=' ')	i--;
		
			if(ans.isEmpty()) {
			ans=ans.concat(s.substring(i+1, j+1));
			}
			else
			{
				ans=ans.concat(" "+s.substring(i+1, j+1));
			}
	}
	System.out.println(ans)		;
	}
	public static void main(String[] args) {
rev_string s = new rev_string();
s.rev("HI hloo");
	}

}
