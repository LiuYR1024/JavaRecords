/*
功能：创建学生类
日期：2021.11.11
作者：liuyr_1024@163.com
更新：（1）2021.11.22: 引入封装概念，将属性私有化，使用get set方法访问属性
*/

/*
属性：学号，姓名，性别，年龄
*/
class Student 
{
	//属性
	private int no;         //学号
	private String name;    //姓名
	private Boolean sex;    //性别
	private int age;        //年龄
	private Seat seat;      //座位
	private Teacher teacher;      //导师

	//方法
	public void setAge(int fAge)     //修改年龄
	{
		if(fAge<0 || fAge>150)       //年龄范围为0-150
		{
			System.out.println("年龄不合法！");
			return;
		}
		age=fAge;
	}
	public int getAge()             //获取年龄
	{
		return age;
	}
}
