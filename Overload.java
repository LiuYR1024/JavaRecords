/*
功能:测试java语言中方法重载机制
结果：当实参为一个int，一个double时，系统自动调用double类型的sum。int型数据进行自动数据类型转换。
日期：2021.11.9
作者：liuyr_1024@163.com
*/
class Overload 
{
	public static void main(String[] args) 
	{
		System.out.println(sum(1,2));        //调用sum，完成两个int类型数据的相加
		System.out.println(sum(1.0,2.0));    //调用sum，完成两个double类型数据的相加
		System.out.println(sum(1,2.0));      //调用sum，完成一个int类型和一个double类型数据相加
		/*
		输出结果：
		invoke int sum()
		3
		invoke double sum()
		3.0
		invoke double sum()
		3.0
		*/
	}

	//int类型的两数求和
	public static int sum(int num1 , int num2)
	{
		System.out.println("invoke int sum()");
		return num1+num2;
	}

	//double类型的两数求和
	public static double sum(double num1 , double num2)
	{
		System.out.println("invoke double sum()");
		return num1+num2;
	}
}
