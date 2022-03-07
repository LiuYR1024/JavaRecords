/**
*功能：测试java中的super()用法
*测试结果：（1）super()必须在构造函数第一行，因此不能和this()共同存在
*		   （2）super()调用父类构造方法，加入参数可以调用父类的有参构造
		   （3）super()和super(参数)均须在构造函数第一行，故不能共存
		   （4）即使不写出super();系统也会默认在构造方法第一行加上一个
*日期：2022.3.7
*作者：liuyr_1024@163.com
*/
public class TestSuper
{
	public static void main(String[] args)
	{
		new TestSuperC3();
	}
}

//该程序中的最高父类，实际上继承于java默认的object类，
//即在该类的构造方法中，系统会默认在第一行使用super()；调用object的构造方法
class TestSuperC1
{
	public TestSuperC1()
	{
		System.out.println("执行C1无参构造方法");
	}
}

class TestSuperC2 extends TestSuperC1
{
	public TestSuperC2()
	{
		System.out.println("执行C2无参构造方法");
	}
}

class TestSuperC3 extends TestSuperC2
{
	public TestSuperC3()
	{
		super();
		System.out.println("执行C3无参构造方法");
	}
}