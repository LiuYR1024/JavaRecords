/**
*���ܣ�����java�е�abstract�ؼ���
*���Խ������1���ǳ�������̳г��󷽷�����Ҫ��д�÷�����
*		   ��2�����󷽷�û�з����壬�������Ŷ�û�С�û������Ĳ�һ�����ǳ��󷽷����ײ���õ�C++������ЩҲû�з����塣
*		   ��3��������ͳ��󷽷����̬�������
*���ڣ�2022.3.23
*���ߣ�liuyr_1024@163.com
*/
public class TestAbstract01
{
	public static void main(String[] args)
	{
		TAbstract01C1 T1=new TAbstract01C2();
		T1.move();
		TAbstract01C1 T2=new TAbstract01C3();
		T2.move();
	}	
}

//������C1
abstract class TAbstract01C1
{
	public abstract void move();
}

//�ǳ�������C2�̳�C1����Ҫ�Գ��󷽷�������д
class TAbstract01C2 extends TAbstract01C1
{
	public void move()
	{
		System.out.println("C2 fly");
	}
}

//�ǳ�������C3�̳�C1����Ҫ�Գ��󷽷�������д
class TAbstract01C3 extends TAbstract01C1
{
	public void move()
	{
		System.out.println("C3 move");
	}
}
