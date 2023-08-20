//1
//2 # 1
//1 # 2 # 3
//4 # 3 # 2 # 1 



class DifferentPattern
{
	public static void main(String[] args)
	{
		int n=4;

		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=i;j++)
				{
					if(j>1)
						System.out.print("#"+j);
					else
						System.out.print(j);
				}
			}
			else //even 
			{
				for(int j=i;j>=1;j--)
				{
					if(j>1)
						System.out.print(j+"#");
					else
						System.out.print(j);
				}
			}
			//new line
			System.out.println("");
		}
	}
}