/*
���빦�ܣ��ӿڹ��ܲ���
���Խ����
1.�ӿ�֧�ֶ�̳�
2.��ʵ�ֽӿ�ʱ��Ҫ���ӿ��еĳ��󷽷�����ʵ��
3.�����̳и���ʵ�ֵĽӿ�,�ڸ�����ʵ�ֹ��Ľӿڣ����Բ�����������ʵ��
4.�ӿ�Ҳ��ʵ�ֶ�̬�����ͳ�������ԣ������չ�ԣ����������
���ڣ�2022.6.21
���ߣ�liuyr_1024@163.com
*/
public class Interface01
{
	public static void main(String[] args)
	{
		C1 c1=new C1();
		c1.M1();
		C2 c2=new C2();
		c2.M1();
		C3 c3=new C3();
		c3.M1();
		I3 c4=new C3();
		c4.M1();
		c4.M2();
	}
} 

//�ӿ�1
interface I1
{
	public void M1();
}

//�ӿ�2
interface I2
{
	public void M2();
}

//�ӿ�3
interface I3 extends I1,I2
{
	public void M3();
}

/*
����: C1���ǳ����, ����δ����I1�еĳ��󷽷�M1()
class C1 implements I1
{
}
*/

class C1 implements I1
{
	public void M1()
	{
		System.out.println("C1.M1");
	}
}

class C2 extends C1
{
}

class C3 extends C1 implements I3
{
	public void M2()
	{
		System.out.println("C3.M2");
	}
	public void M3()
	{
		System.out.println("C3.M3");
	}
}