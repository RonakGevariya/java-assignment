package Module2;

public class Que7 
{
	public static void main(String[] args) 
	{
		String r="successes";
		System.out.println("String is:"+r);
		
		int i,fmax=0,smax=0;
		int a[] = new int[256];
		for(i=0;i<r.length();i++)
		{
			if(r.charAt(i)!=' ')
			{
				a[r.charAt(i)]++;
			}
		}
		for(i=0;i<256;i++)
		{
			if(a[i]>a[fmax])
			{
				smax=fmax;
				fmax=i;
			}
			else if(a[i]>a[smax]&&a[i]!=a[fmax])
			{
				smax=i;
			}
		}
		System.out.println("The second most occuring character is :"+(char)(smax));
	}
}
