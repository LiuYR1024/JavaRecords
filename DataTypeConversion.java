/*
代码目的：（1）用于测试Java中混合数据类型运算规则
		  （2）用于测试编译期不进行数据运算
日期：2021.10.26
作者：liuyr_1024@163.com
*/
public class DataTypeConversion  
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=a/3;
		System.out.println(b);    //输出3

		byte c=3;
		System.out.println(c);    //输出3

		/*
		byte d=a/3;
		System.out.println(d);
		错误: 不兼容的类型: 从int转换到byte可能会有损失。
		java数字字面值默认为int类型，右边最终结果为int型。
		虽然a/3=3，未超出byte（1个字节）可直接表示的范围，
		但编译期不会进行运算，判断结果是否在不用类型转换的表示范围之内
		*/
		
	}
}
