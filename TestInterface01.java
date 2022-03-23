/**
*功能：测试java中的interface关键字
*测试结果：（1）接口支持多继承。
*		   （2）接口中只有常量和抽象方法，常量和抽象方法的修饰词列表可以省略不写。
*日期：2022.3.23
*作者：liuyr_1024@163.com
*/
public class TestInterface01 
{
	public static void main(String[] args) 
	{
		System.out.println(TInterface01I3.A);
		System.out.println(TInterface01I3.B);

		//错误: 无法为最终变量B分配值
		//TInterface01I3.B=50;
	}
}

interface TInterface01I1
{
	int A=10;
	void move();
}

interface TInterface01I2
{
	int B=200;
}

interface TInterface01I3 extends TInterface01I1,TInterface01I2
{
}
