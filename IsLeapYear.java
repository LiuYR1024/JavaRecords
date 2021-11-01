/*
代码功能：根据提示输入（0,9999）之内的年份，系统返回是否是闰年的判断结果
日期：2021.11.1
作者：liuyr_1024@163.com
*/
class IsLeapYear 
{
	public static void main(String[] args) 
	{
		System.out.print("请输入年份：");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int year=s.nextInt();
		if((year>0)&&(year<9999))              //输入年份在区间（0,9999）之内
		{
			//闰年的判断标准（满足其中一个条件即为闰年）：
			//1.能被4整除，但是不能被100整除
			//2.能被400整除
			if(((0==year%4)&&(0!=year%100))||(0==year%400))
			{
				System.out.println(year+"年是闰年");
			}
			else
			{
				System.out.println(year+"年不是闰年");
			}
		}
		else                                   //输入年份不在区间（0,9999）之内
		{
			System.out.println("输入的年份不合法");
		}
	}
}
