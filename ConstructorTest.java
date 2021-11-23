/**
*代码功能：测试java中的构造函数
*测试结果：（1）创建类以后，系统会自动创建一个不可见的无参数构造函数
*		   （2）自己写了构造函数后，系统自动创建的构造函数消失
*               为了防止进行不设初值的对象创建，需要写出这一个构造函数，由此可见构造函数支持重载
*日期：2021.11.23
*作者：liuyr_1024@163.com
*/
class ConstructorTest 
{
	public static void main(String[] args) 
	{
		Student stu1 = new Student();                         //调用无参数构造函数
		System.out.println("学号为：" + stu1.getNo());
		System.out.println("姓名为：" + stu1.getName());

		Student stu2 = new Student(10086,"小刘");             //调用含参数构造函数
		System.out.println("学号为：" + stu2.getNo());
		System.out.println("姓名为：" + stu2.getName());
		System.out.println("年龄为：" + stu2.getAge());       //对于没有通过实参初始化的实例变量，赋默认值
	}
}
