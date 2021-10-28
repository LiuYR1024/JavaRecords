/*
作用：测试i+=10和i=i+10的区别
结果：i+=10;（假设i为byte型）等价于i=(byte)(i+10);
日期：2021.10.28
作者：liuyr_1024@163.com
*/
class AssignmentOperator 
{
	public static void main(String[] args) 
	{
		byte i=10;
		System.out.println(i);
		//i=i+10;                //错误: 不兼容的类型: 从int转换到byte可能会有损失
		//i为byte型，10是默认的int型，两者相加的结果是int型，不能赋给左边的byte型

		i+=10;          //等价于i=(byte)(i+10);进行了强制类型转换
	    System.out.println(i);
	}
}
