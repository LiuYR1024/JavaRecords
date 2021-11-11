/*
功能：创建对象，使用对象
日期：2021.11.11
作者：liuyr_1024@163.com
*/
class ObjectTest 
{
	public static void main(String[] args) 
	{
		Student stu = new Student();               //创建Student类型对象，使用局部变量stu作为该对象的引用

		//测试默认值
		System.out.println("学号：" + stu.no);
		System.out.println("姓名：" + stu.name);
		System.out.println("性别：" + stu.sex);
		System.out.println("年龄：" + stu.age);

		stu.name = "LYR";                          //修改对象属性
		System.out.println("姓名：" + stu.name);
	}
}
