/**
*���ܣ�����java�е�interface�ؼ���
*���Խ������1���ӿ�֧�ֶ�̳С�
*		   ��2���ӿ���ֻ�г����ͳ��󷽷��������ͳ��󷽷������δ��б����ʡ�Բ�д��
*���ڣ�2022.3.23
*���ߣ�liuyr_1024@163.com
*/
public class TestInterface01 
{
	public static void main(String[] args) 
	{
		System.out.println(TInterface01I3.A);
		System.out.println(TInterface01I3.B);

		//����: �޷�Ϊ���ձ���B����ֵ
		//TInterface01I3.B=50;
	}
}

interface TInterface01I1
{
	int A=10;
	void move();
}

interface TInterface01I2
{
	int B=200;
}

interface TInterface01I3 extends TInterface01I1,TInterface01I2
{
}
