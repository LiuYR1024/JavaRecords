/**
*功能：测试java中的super.的用法
*测试结果：（1）super.XXX也不能在子类中访问父类的私有属性，私有属性只能在本类中访问。
*		   （2）super.指向子类中的父类特征块，不能当成引用使用
		   （3）super.用在子类中属性或方法与父类重名时，区分父类特征
*日期：2022.3.9
*作者：liuyr_1024@163.com
*/
public class TestSuper01
{
	public static void main(String[] args)
	{
		TestSuper01C2 C2=new TestSuper01C2("C2");
		C2.dosomething();
	}
}

//父类
class TestSuper01C1
{
	String name;
	public TestSuper01C1()
	{
	}
	public TestSuper01C1(String name)
	{
		this.name=name;
	}
}

//第一子类
class TestSuper01C2 extends TestSuper01C1
{
	String name;
	/*若是注释掉上一句，即在C2中不再设置name这个和父类C1同名的变量
	输出为：C2在dosomething
            C2在dosomething
	因为父类特征中的属性依旧是属性的一部分
	*/
	public TestSuper01C2()
	{
	}
	public TestSuper01C2(String name)
	{
		super(name);
	}
	public void dosomething()
	{
		System.out.println(name+"在dosomething");        
		//输出：null在dosomething
		//原因：类C2中具有具有name属性，所以此处的name就是C2中的name，由于未赋初值，为系统默认值。
		System.out.println(super.name+"在dosomething"); 
		//输出：C2在dosomething
		//原因：super.指向子类中的父类特征，在创建C2对象时调用了有参构造方法，将super.name赋值为C2
	}
}

//预设的第二子类，但是此种使用方法有误
/*
class TestSuper01C3 extends TestSuper01C2
{
	String name;
	public TestSuper01C3()
	{
	}
	public TestSuper01C3(String name)
	{
		super(name);
	}
	public void dosomething()
	{
		System.out.println(name+"在dosomething");
		System.out.println(super.name+"在dosomething");
		System.out.println(super.super.name+"在dosomething");
		//不支持这种调用方法，因为父类已经继承了祖父类的所有属性，那么孙子类访问祖父类多此一举。
		//但是要是祖父类的私有属性呢？祖父的名字肯定不能继承给父亲。
	}
}
*/
