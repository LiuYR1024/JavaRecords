/*
功能:使用递归计算1+2+3+...+n
日期：2021.11.10
作者：liuyr_1024@163.com
*/
class Recursion 
{
	public static void main(String[] args) 
	{
		int n=8;
		int result=accumulate(n);
		System.out.println(result);
	}

	//利用递归计算1~n的累加和
	public static int accumulate(int n)
	{
		if(1==n)//递归结束的条件
		{
			return n;
		}	
		return n+accumulate(n-1);  //递归调用accumulate()
	}
}
