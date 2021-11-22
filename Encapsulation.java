/*
功能：测试java语言中的封装。封装是在方法中进行限制，防止属性被随意修改，比如，改年龄为-100这种不合理的数字
日期：2021.11.22
作者：liuyr_1024@163.com
*/
class Encapsulation 
{
	public static void main(String[] args) 
	{
		Student stu = new Student();

		/*
		//不能这么访问age，因为age在Student类中是private类型，私有类型，非公开
		System.out.println("学生年龄为：" + stu.age);
		*/

		System.out.println("学生年龄为：" + stu.getAge());     //使用getAge方法获取学生年龄，输出结果为0

		stu.setAge(200);                                       //形参不在正确范围内，输出“年龄不合法！”
		System.out.println("学生年龄为：" + stu.getAge());     //输出结果为0

		stu.setAge(100);                                       //使用setAge方法修改学生年龄
		System.out.println("学生年龄为：" + stu.getAge());     //输出结果为100
	}
}
