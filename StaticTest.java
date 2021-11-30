/**
*功能：测试java中的static关键字
*测试结果：（1）带static关键字的属性表示该类的改属性值均一样，使用“类名.属性名”的方式访问
*				也可使用“引用.属性名”的方式访问，但实际上引用会被系统替换为类名
*		   （2）protected修饰的属性可以直接采用“引用.属性名”的方式访问，也可通过set、get函数操作
*				private修饰的属性不能才有“引用.属性名”的方式访问，只能通过set、get函数操作
*		   （3）类代码块在引入类字节码文件时执行，且只执行一次
*				对象代码块在创建对象时执行，每当创建一个对象时，均会执行一次
*日期：2021.11.30
*作者：liuyr_1024@163.com
*/
class StaticTest 
{
	public static void main(String[] args) 
	{
		System.out.println("主方法执行");
		Student stu1=new Student();                

		System.out.println(Student.school);         //类名.属性名
		System.out.println(stu1.school);            //引用.属性名

		//System.out.println(stu1.name);            //错误：不能通过“引用.属性名”访问private属性

		stu1.grade=5;                               //通过“引用.属性名”访问protected属性
		System.out.println(stu1.grade);
		stu1.setGrade(6);                           //通过set函数访问protected属性
		System.out.println(stu1.getGrade());             //通过get函数访问protected属性

		//System.out.println(Student.grade);       //错误，无法从静态上下文中引用非静态 变量 grade

		
		Student stu2=new Student();
	}
}
