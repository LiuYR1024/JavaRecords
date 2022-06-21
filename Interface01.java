/*
代码功能：接口功能测试
测试结果：
1.接口支持多继承
2.类实现接口时需要将接口中的抽象方法进行实现
3.子类会继承父类实现的接口,在父类中实现过的接口，可以不用在子类中实现
4.接口也可实现多态，降低程序耦合性，提高扩展性，面向抽象编程
日期：2022.6.21
作者：liuyr_1024@163.com
*/
public class Interface01
{
	public static void main(String[] args)
	{
		C1 c1=new C1();
		c1.M1();
		C2 c2=new C2();
		c2.M1();
		C3 c3=new C3();
		c3.M1();
		I3 c4=new C3();
		c4.M1();
		c4.M2();
	}
} 

//接口1
interface I1
{
	public void M1();
}

//接口2
interface I2
{
	public void M2();
}

//接口3
interface I3 extends I1,I2
{
	public void M3();
}

/*
错误: C1不是抽象的, 并且未覆盖I1中的抽象方法M1()
class C1 implements I1
{
}
*/

class C1 implements I1
{
	public void M1()
	{
		System.out.println("C1.M1");
	}
}

class C2 extends C1
{
}

class C3 extends C1 implements I3
{
	public void M2()
	{
		System.out.println("C3.M2");
	}
	public void M3()
	{
		System.out.println("C3.M3");
	}
}