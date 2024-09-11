package String;



public class uppertolower {
	public void uptolo(String s)
	{
		char ch[] =s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char c =ch[i];
			if(c>='A'&& c<='Z')
			{
				char ans = (char)(c-'A'-'a');
				ch[i]=ans;
			}
		}
		for(char x:ch) {
		System.out.print(x);
		}
		
	}

	public static void main(String[] args) {
		String st= "wELCOmetomyCHNAnnel";
		uppertolower t =new uppertolower();
		t.uptolo(st);
		//System.out.println(s);
		

	}

}
