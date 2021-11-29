/**
*功能：测试java中的this，测试java中各种情况下的方法调用
*测试结果：（1）this指代当前的对象，可以缺省，系统会自动补齐，当出现冲突时必须写上
*		   （2）调用带有static的方法采有“类名.方法名”的方式，不含有当前对象，也就没有this
*		   （3）可以在无参构造函数中使用“this（实参）”调用写好的含参构造函数，减少代码重复且为属性赋自定义初值
*		   （4）this可以穿透，即在非static的方法中调用非static方法也是可行的。
*               因为前一个方法必须在创建对象的前提小调用，故后一个方法调用时的this有效
*		   （5）带有static的方法也可以才有“对象名.方法名”的方式调用，系统会自动转换为“类名.方法名”
*		   （6）static方法调用static方法：“类名.方法名”（同一个类中可以直接“方法名”），“对象名.方法名”
*               static方法中调用非static方法：“对象名.方法名”
*				非static方法调用static方法：“类名.方法名”（同一个类中可以直接“方法名”），“对象名.方法名”
*               非static方法中调用非static方法：“this.方法名”，可以省略this不写
*日期：2021.11.29
*作者：liuyr_1024@163.com
*/

class ThisTest 
{
	public static void method1()
	{
		System.out.println("method1");
	}


	public void method3()
	{
		System.out.println("method3");

		ThisTest.method1();                   //“类名.方法名”的完整调用方式，在非static方法中，调用static方法
		method1();                            //在非static方法中，调用同一个类中调用static方法可以省略类名不写
		ThisTest tt1=new ThisTest();          //创建一个ThisTest对象
		tt1.method1();                        //在非static方法中，采用“对象名.方法名”的方式，调用static方法
		tt1=null;                             //将引用tt1置空，堆区开辟的内存空间已经释放
		tt1.method1();                        //此处仍然可以使用这种方法调用method，说明“对象名.方法名”的调用方式
		                                      //实际上是通过对象名确定了类名，真实调用还是“类名.方法名”

		this.method4();                       //非static方法中，采用“this.方法名”的方式调用非static方法
		method4();							  //this可以省略不写
	}

	public  void method4()
	{
		System.out.println("method4");
	}



	public static void main(String[] args) 
	{
		Student stu1=new Student();           //调用无参构造函数，创建一个学生对象

		System.out.println(stu1.getNo());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		System.out.println(stu1.getSex());

		System.out.println("*******************");

		ThisTest.method1();                   //“类名.方法名”的完整调用方式，在static方法中，调用static方法
		method1();                            //在static方法中，调用同一个类中调用static方法可以省略类名不写
		ThisTest tt1=new ThisTest();          //创建一个ThisTest对象
		tt1.method1();                        //在static方法中，采用“对象名.方法名”的方式，调用static方法
		tt1=null;                             //将引用tt1置空，堆区开辟的内存空间已经释放
		tt1.method1();                        //此处仍然可以使用这种方法调用method，说明“对象名.方法名”的调用方式
		                                      //实际上是通过对象名确定了类名，真实调用还是“类名.方法名”
		
		System.out.println("*******************");

		//ThisTest.method3();                 //错误，在static方法中，非static方法不能用“类名.方法名”的方式调用
		//method3();                          //错误，在static方法中，非static方法不能用“方法名”的方式调用
		//this.method3();                     //错误，在static方法中，非static方法不能用“this.方法名”的方式调用       
		ThisTest tt2=new ThisTest();
		tt2.method3();                        //static方法中调用非static方法，采用“对象名.方法名”的方式


	}
}
