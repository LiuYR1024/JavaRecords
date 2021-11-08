/*
功能：测试方法中的return语句
日期：2021.11.8
作者：liuyr_1024@163.com
*/
class MethodTest1 
{
	public static void main(String[] args) 
	{
		//调用同一个类下的方法可以不在前面加类名
		System.out.println(doSomething());   //在输出方法内部调用dosomething方法
	}
	public static int doSomething()
	{
		int i=3;

		/*
		//错误: 缺少返回语句
		//虽然逻辑上已经囊括了所有的可能性，但编译阶段只看数据类型是否符合要求，不会去进行数值的判断
		if(i<10)
		{
			return 1;
		}
		else if(i>=10)
		{
			return 0;
		}
		*/

		if(i<10)
		{
			return 1;
		}
		else           //使用了else，则一定有一个条件分支被执行
		{
			return 0;
		}
	}

}
