class Encrypt
{
	public String perform(String word)
	{
		char vowel[]= {'a','e','i','o','u','a','e','i','o','u','a','e','i','o','u'};
		int j=0;
		for(int i=0;i<word.length();i++)
		{
			if(i%2==0)
			{
				continue;
			}
			else if(i%2!=0)
			{
				if(word.charAt(i)==' ')
				{
					continue;
				}
				word=Add(word, vowel[j],i);
				j++;		
			}
		}
		return word;
	}
	public static String  Add(String str, char c,int pos)
    {
        return str.substring(0, pos) + c
            + str.substring(pos);
    }
	}
public class EncptVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Encrypt e=new Encrypt();
		System.out.println(e.perform("My name"));			
	
	}

}
