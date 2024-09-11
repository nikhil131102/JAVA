package String;
/*ex=hello Guys. --->hullo geys
 * w'e'lc'o'm'e' t'o' C'o'd'i'ng ---> wilcomo te codeng
 * 2 loop one from starting and other from ending and then swap all the vowel,we saw
 
 */
public class rev_vowels {
	public static void reverse(String s)
	{  
		char [] c = s.toCharArray();
		int i =0;
		int j=s.length()-1;
		while(i<j)
		{
			while(c[i]!='a'&& c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u')
			{
				i++;
			}
			while(c[j]!='a'&& c[j]!='e'&&c[j]!='i'&&c[j]!='o'&&c[j]!='u')
			{
				j--;
			}
			//if iand j pointing to "aeiou"
			if(i>=j)   //if they cross
				
			{
				break;
			}
			char ch = c[i];
			c[i]=c[j];
			c[j]=ch;
			i++;
			j--;
			
			
		}
		for (char ch=0;ch<c.length;ch++)
		{
			System.out.print(c[ch]);
		}
	
	}

	public static void main(String[] args) {
	String s ="Welcometocoding";	
	reverse(s);
	
	
}
	}


