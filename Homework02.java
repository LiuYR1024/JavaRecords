/*
���빦�ܣ���ҵ2��ģ�������
���ڣ�2022.3.10
���ߣ�liuyr_1024@163.com
*/
public class Homework02
{ 
	public static void main(String[] args) 
	{
		Number N1=new Number(10,6);
		System.out.println("��ӽ��Ϊ��"+N1.addition());
		System.out.println("������Ϊ��"+N1.subtration());
		System.out.println("��˽��Ϊ��"+N1.multiplication());
		System.out.println("������Ϊ��"+N1.division());
	}
}

class Number
{
	private int n1;
	private int n2;
	public Number(){}
	public Number(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	public int addition()
	{
		return n1+n2;
	}
	public int subtration()
	{
		return n1-n2;
	}
	public int multiplication()
	{
		return n1*n2;
	}
	public double division()
	{
		return n1/n2;
	}
}
