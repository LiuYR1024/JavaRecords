/**
*功能：测试java中的this在构造函数时的使用，测试java中构造函数之间的相互调用
*测试结果：（1）可以在无参构造函数中使用“this（实参）”调用写好的含参构造函数，减少代码重复且为属性赋自定义初值
*		   （2）java类定义中调用构造函数，不能直接使用构造函数名调用，需要this关键字
*日期：2022.2.28
*作者：liuyr_1024@163.com
*/

public class TestThisForConstructor
{
	public static void main(String[] args)
	{
		TTFCclass1 s1 = new TTFCclass1(10);
		TTFCclass1 s2 = new TTFCclass1("张三");
//		TTFCclass1 s3 = new TTFCclass1(1111,"李四");

		System.out.println("s1.id="+s1.getId());
		System.out.println("s1.name="+s1.getName());

		System.out.println("s2.id="+s2.getId());
		System.out.println("s2.name="+s2.getName());

/**
		System.out.println("s3.id="+s3.getId());
		System.out.println("s3.name="+s3.getName());
*/
	}
}

class TTFCclass1
{
	private int id;
	private String name;

	public TTFCclass1(int id)
	{
		this.id=id;
	}

	public TTFCclass1(String name)
	{
		this(100);
		this.name = name;
	}

/**
	//错误: 找不到符号 TTFCclass1(id);
	public TTFCclass1(int id,String name)
	{
		TTFCclass1(id);
		TTFCclass1(name);
	}
*/

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
}