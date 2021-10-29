/*
作用：从键盘输入字符串或者int型数字到内存空间
日期：2021.10.29
作者：liuyr_1024@163.com
*/
class KeyInput 
{
	public static void main(String[] args) 
	{
		java.util.Scanner s = new java.util.Scanner(System.in);      //创建对象
		String str=s.next();      //调用函数，控制台待输入，直到按下回车键,将中间部分的内容以字符串形式保存
		System.out.println("输入内容为："+str);
		int num=s.nextInt();      //调用函数，接收整型数字输入，不能超出整型数字范围
		System.out.println("输入数字为："+num);
	}
}
