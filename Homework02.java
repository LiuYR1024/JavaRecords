/*
代码功能：作业2，模拟计算器
日期：2022.3.10
作者：liuyr_1024@163.com
*/
public class Homework02
{ 
	public static void main(String[] args) 
	{
		Number N1=new Number(10,6);
		System.out.println("相加结果为："+N1.addition());
		System.out.println("相减结果为："+N1.subtration());
		System.out.println("相乘结果为："+N1.multiplication());
		System.out.println("相除结果为："+N1.division());
	}
}

class Number
{
	private int n1;
	private int n2;
	public Number(){}
	public Number(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	public int addition()
	{
		return n1+n2;
	}
	public int subtration()
	{
		return n1-n2;
	}
	public int multiplication()
	{
		return n1*n2;
	}
	public double division()
	{
		return n1/n2;
	}
}
