/**
*功能：创建Pupil类，继承至Student类
*日期：2021.11.30
*作者：liuyr_1024@163.com
*/
class Pupil extends Student
{
	public int getGrade()             //重写获取年级方法
	{
		System.out.println("小学生年级已获取");     //标识语句，不影响功能，为了说明方法覆盖而写
		return grade;
	}
}
