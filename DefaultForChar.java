//测试char类型默认值的显示情况
//测试结果：java版本“1.8.0_101”,char的默认值显示为空
//日期：2021.10.25
//作者：liuyr_10242@163.com
//补充：显示情况和控制台窗口设置有关
public class DefaultForChar 
{
	static char globalC;          //成员变量不赋值声明，系统会自动赋默认值
	public static void main(String[] args) 
	{
		char localC='\u0000';    //\u0000是char类型的默认值
		System.out.println(localC);
		System.out.println("===========");
		System.out.println(globalC);
	}
}
