/**
*���ܣ�����java�е�super()�÷�
*���Խ������1��super()�����ڹ��캯����һ�У���˲��ܺ�this()��ͬ����
*		   ��2��super()���ø��๹�췽��������������Ե��ø�����вι���
		   ��3��super()��super(����)�����ڹ��캯����һ�У��ʲ��ܹ���
		   ��4����ʹ��д��super();ϵͳҲ��Ĭ���ڹ��췽����һ�м���һ��
*���ڣ�2022.3.7
*���ߣ�liuyr_1024@163.com
*/
public class TestSuper
{
	public static void main(String[] args)
	{
		new TestSuperC3();
	}
}

//�ó����е���߸��࣬ʵ���ϼ̳���javaĬ�ϵ�object�࣬
//���ڸ���Ĺ��췽���У�ϵͳ��Ĭ���ڵ�һ��ʹ��super()������object�Ĺ��췽��
class TestSuperC1
{
	public TestSuperC1()
	{
		System.out.println("ִ��C1�޲ι��췽��");
	}
}

class TestSuperC2 extends TestSuperC1
{
	public TestSuperC2()
	{
		System.out.println("ִ��C2�޲ι��췽��");
	}
}

class TestSuperC3 extends TestSuperC2
{
	public TestSuperC3()
	{
		super();
		System.out.println("ִ��C3�޲ι��췽��");
	}
}