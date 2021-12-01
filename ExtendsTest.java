/**
*功能：测试java中的继承
*测试结果：（1）子类直接继承父类中的非private属性和方法
*				可间接访问private属性
*		   （2）方法重写：方法名，返回值类型，形参列表都需要保持一致才能构成方法覆盖
*日期：2021.11.30
*作者：liuyr_1024@163.com
*/
class ExtendsTest 
{
	public static void main(String[] args) 
	{
		Student stu1=new Student();                         //创建学生对象
		System.out.println("名字：" + stu1.getName());
		System.out.println("年级：" + stu1.getGrade());

		Pupil pup1=new Pupil();                             //创建小学生对象
		System.out.println("名字：" + pup1.getName());
		System.out.println("年级：" + pup1.getGrade());     //此处调用的是重写后的getGrade方法

		//System.out.println("年级：" + pup1.name);         //错误：不能这么访问private属性
		System.out.println("年级：" + pup1.grade);          //直接访问从父类继承得到的protected属性

	}
}
