/**
*功能：测试java中的abstract关键字
*测试结果：（1）非抽象子类继承抽象方法后需要重写该方法。
*		   （2）抽象方法没有方法体，连大括号都没有。没方法体的不一定都是抽象方法，底层调用的C++函数有些也没有方法体。
*		   （3）抽象类和抽象方法与多态紧密相关
*日期：2022.3.23
*作者：liuyr_1024@163.com
*/
public class TestAbstract01
{
	public static void main(String[] args)
	{
		TAbstract01C1 T1=new TAbstract01C2();
		T1.move();
		TAbstract01C1 T2=new TAbstract01C3();
		T2.move();
	}	
}

//抽象类C1
abstract class TAbstract01C1
{
	public abstract void move();
}

//非抽象子类C2继承C1，需要对抽象方法进行重写
class TAbstract01C2 extends TAbstract01C1
{
	public void move()
	{
		System.out.println("C2 fly");
	}
}

//非抽象子类C3继承C1，需要对抽象方法进行重写
class TAbstract01C3 extends TAbstract01C1
{
	public void move()
	{
		System.out.println("C3 move");
	}
}
