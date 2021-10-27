/*
作用：测试逻辑与&和短路与&&的区别
结论：短路与只有在前一个条件判断为真时，才会进行后一个条件的运算
	  逻辑与&不管前一个条件判断结果如何，都会进行后一个条件的运算
日期：2021.10.27
作者：liuyr_1024@163.com
*/
class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=12;
		boolean z=(x>y)&(++x>y);
		System.out.println(x);     //11
		//使用逻辑与&，即使前一个条件已经判断为假，仍然进行了后一个条件的运算断

		z=(x>y)&&(++x>y);
		System.out.println(x);     //11
		//使用短路与&&，前一个条件判断为假的时候，后一个条件里面的运算不再进行

		z=(x<y)&&(++x>y);
		System.out.println(x);     //12
		//使用短路与&&，前一个条件判断为真时，才进行后一个条件的运算
	}
}
