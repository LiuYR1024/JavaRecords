/*
����:����java�����з������ػ���
�������ʵ��Ϊһ��int��һ��doubleʱ��ϵͳ�Զ�����double���͵�sum��int�����ݽ����Զ���������ת����
���ڣ�2021.11.9
���ߣ�liuyr_1024@163.com
*/
class Overload 
{
	public static void main(String[] args) 
	{
		System.out.println(sum(1,2));        //����sum���������int�������ݵ����
		System.out.println(sum(1.0,2.0));    //����sum���������double�������ݵ����
		System.out.println(sum(1,2.0));      //����sum�����һ��int���ͺ�һ��double�����������
		/*
		��������
		invoke int sum()
		3
		invoke double sum()
		3.0
		invoke double sum()
		3.0
		*/
	}

	//int���͵��������
	public static int sum(int num1 , int num2)
	{
		System.out.println("invoke int sum()");
		return num1+num2;
	}

	//double���͵��������
	public static double sum(double num1 , double num2)
	{
		System.out.println("invoke double sum()");
		return num1+num2;
	}
}
