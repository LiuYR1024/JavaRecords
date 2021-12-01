/**
*功能：测试java中的多态
*测试结果：（1）多态可以减少代码耦合，提高代码移植性
*		   （2）多态是指同一对象，代码编译阶段的对象类型和运行阶段的对象类型不一样
*日期：2021.12.1
*作者：liuyr_1024@163.com
*/
class PolymorphismTest
{
	public static void main(String[] args) 
	{
		Master m1=new Master();
		//创建的是子类对象，赋给了父类。若是创建父类对象，赋给子类，则需要使用instanceof做判断，减少出错。
		//编译阶段被当成父类，而父类中确实存在eat方法，故不会报错。若需要使用到子类独有的方法，则不可行
		//运行阶段被当成子类对象，显示出特殊性
		//面向对象要面向最为抽象的对象，而非具体的对象
		Pet p=new Cat();            
		m1.feed(p);
		p=new Dog();
		m1.feed(p);	
	}
}

class Master
{
	public void feed(Pet p)
	{
		p.eat();
	}
}

class Pet
{
	public void eat()
	{
		System.out.println("宠物在吃东西");
	}
}

class Cat extends Pet
{
	public void eat()
	{
		System.out.println("小猫在吃东西");
	}
}

class Dog extends Pet
{
	public void eat()
	{
		System.out.println("小狗在吃东西");
	}
}