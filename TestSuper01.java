/**
*���ܣ�����java�е�super.���÷�
*���Խ������1��super.XXXҲ�����������з��ʸ����˽�����ԣ�˽������ֻ���ڱ����з��ʡ�
*		   ��2��super.ָ�������еĸ��������飬���ܵ�������ʹ��
		   ��3��super.�������������Ի򷽷��븸������ʱ�����ָ�������
*���ڣ�2022.3.9
*���ߣ�liuyr_1024@163.com
*/
public class TestSuper01
{
	public static void main(String[] args)
	{
		TestSuper01C2 C2=new TestSuper01C2("C2");
		C2.dosomething();
	}
}

//����
class TestSuper01C1
{
	String name;
	public TestSuper01C1()
	{
	}
	public TestSuper01C1(String name)
	{
		this.name=name;
	}
}

//��һ����
class TestSuper01C2 extends TestSuper01C1
{
	String name;
	/*����ע�͵���һ�䣬����C2�в�������name����͸���C1ͬ���ı���
	���Ϊ��C2��dosomething
            C2��dosomething
	��Ϊ���������е��������������Ե�һ����
	*/
	public TestSuper01C2()
	{
	}
	public TestSuper01C2(String name)
	{
		super(name);
	}
	public void dosomething()
	{
		System.out.println(name+"��dosomething");        
		//�����null��dosomething
		//ԭ����C2�о��о���name���ԣ����Դ˴���name����C2�е�name������δ����ֵ��ΪϵͳĬ��ֵ��
		System.out.println(super.name+"��dosomething"); 
		//�����C2��dosomething
		//ԭ��super.ָ�������еĸ����������ڴ���C2����ʱ�������вι��췽������super.name��ֵΪC2
	}
}

//Ԥ��ĵڶ����࣬���Ǵ���ʹ�÷�������
/*
class TestSuper01C3 extends TestSuper01C2
{
	String name;
	public TestSuper01C3()
	{
	}
	public TestSuper01C3(String name)
	{
		super(name);
	}
	public void dosomething()
	{
		System.out.println(name+"��dosomething");
		System.out.println(super.name+"��dosomething");
		System.out.println(super.super.name+"��dosomething");
		//��֧�����ֵ��÷�������Ϊ�����Ѿ��̳����游����������ԣ���ô����������游����һ�١�
		//����Ҫ���游���˽�������أ��游�����ֿ϶����ܼ̳и����ס�
	}
}
*/
