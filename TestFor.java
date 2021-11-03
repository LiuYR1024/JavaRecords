/*
代码功能，接收输入数据dayNum，返回1+2+4+...+2^(dayNum-1)的计算结果
日期：2021.11.3
作者：liuyr_1024@163.com
*/
class TestFor 
{
	public static void main(String[] args) 
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入天数（1-20）：");
		int dayNum=s.nextInt();

		if((dayNum>0)&&(dayNum<=20))
		{
			int result=0;              //存放计算结果
			int temp=1;				   //临时变量，存放第i个数据的值
			for(int i=1;i<=dayNum;i++) 
			{
				result+=temp;          //累加
				temp*=2;               //temp初值为1，已经能够表述第一个数据，所以把改变temp放在累加计算的后面
			}
			System.out.println("总数为："+result);
		}
		else
		{
			System.out.println("输入数据不合法！");		
		}
	}	
}
