/**
*功能：测试java中的final关键字
*测试结果：（1）final修饰的方法可以重载，但不能覆盖。
*		   （2）final修饰的成员变量必须手动赋初值，否则系统赋成默认值后就不能修改
*				final修饰的成员变量赋初值的操作可以在构造函数中进行，因为系统也是在这里赋默认值的
*				如果构造方法发生重载，则每个构造方法中均要初始化final修饰的成员变量
*日期：2022.3.22
*作者：liuyr_1024@163.com
*/
public class TestFinal01
{
	public static void main(String[] args)
	{
		TestFinal01C1 T1=new TestFinal01C1();
		T1.dosome();
		T1.dosome(10);

		TestFinal01C2 T2=new TestFinal01C2();
		T2.dosome();
		T2.dosome(10);
	}
}

class TestFinal01C1
{
	/*
	private final int a;

	//TestFinal01C1() {}
	//错误: 可能尚未初始化变量a

	TestFinal01C1(int a)
	{
		this.a=a;
	}
	*/

	public final void dosome()
	{
		System.out.println("C1 dosome");
	}

	public void dosome(int i)
	{
		System.out.println("C1 dosome int");
	}
}

class TestFinal01C2 extends TestFinal01C1
{
	/*
	//报错：TestFinal01C2中的dosome()无法覆盖TestFinal01C1中的dosome()
	public final void dosome()
	{
		System.out.println("C2 dosome");
	}
	*/

	public void dosome(int i)
	{
		System.out.println("C2 dosome int");
	}
}
