/*
ProblemStatement
10101
01010
10101
01010
10101
*/


public class Pattern104 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		for(int i=0; i<irange; i++)
		{
			for(int j=0; j<jrange; j++)
			{
				if((j+i)%2==0)
				System.out.print("1");
				else
				System.out.print("0");
			}
			System.out.println();
		}
	}
}
/*
OutPut
10101
01010
10101
01010
10101
*/
