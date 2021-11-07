/*
功能：利用方法计算并输出两数之和
日期：2021.11.7
作者：liuyr_1024@163.com
*/
class MethodTest 
{
	public static void main(String[] args)     //主方法，程序入口 
	{
		sum(10,20);                            //调用sum()，计算10和20的和并输出
	}
	
	//计算num1和num2的和，并以“num1+num2=和”的形式输出
	public static void sum(int num1 , int num2)
	{
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
}
