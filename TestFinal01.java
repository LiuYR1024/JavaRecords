/**
*���ܣ�����java�е�final�ؼ���
*���Խ������1��final���εķ����������أ������ܸ��ǡ�
*		   ��2��final���εĳ�Ա���������ֶ�����ֵ������ϵͳ����Ĭ��ֵ��Ͳ����޸�
*				final���εĳ�Ա��������ֵ�Ĳ��������ڹ��캯���н��У���ΪϵͳҲ�������︳Ĭ��ֵ��
*				������췽���������أ���ÿ�����췽���о�Ҫ��ʼ��final���εĳ�Ա����
*���ڣ�2022.3.22
*���ߣ�liuyr_1024@163.com
*/
public class TestFinal01
{
	public static void main(String[] args)
	{
		TestFinal01C1 T1=new TestFinal01C1();
		T1.dosome();
		T1.dosome(10);

		TestFinal01C2 T2=new TestFinal01C2();
		T2.dosome();
		T2.dosome(10);
	}
}

class TestFinal01C1
{
	/*
	private final int a;

	//TestFinal01C1() {}
	//����: ������δ��ʼ������a

	TestFinal01C1(int a)
	{
		this.a=a;
	}
	*/

	public final void dosome()
	{
		System.out.println("C1 dosome");
	}

	public void dosome(int i)
	{
		System.out.println("C1 dosome int");
	}
}

class TestFinal01C2 extends TestFinal01C1
{
	/*
	//����TestFinal01C2�е�dosome()�޷�����TestFinal01C1�е�dosome()
	public final void dosome()
	{
		System.out.println("C2 dosome");
	}
	*/

	public void dosome(int i)
	{
		System.out.println("C2 dosome int");
	}
}
