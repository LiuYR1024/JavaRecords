/**
*���ܣ�����java�е�this�ڹ��캯��ʱ��ʹ�ã�����java�й��캯��֮����໥����
*���Խ������1���������޲ι��캯����ʹ�á�this��ʵ�Σ�������д�õĺ��ι��캯�������ٴ����ظ���Ϊ���Ը��Զ����ֵ
*		   ��2��java�ඨ���е��ù��캯��������ֱ��ʹ�ù��캯�������ã���Ҫthis�ؼ���
*���ڣ�2022.2.28
*���ߣ�liuyr_1024@163.com
*/

public class TestThisForConstructor
{
	public static void main(String[] args)
	{
		TTFCclass1 s1 = new TTFCclass1(10);
		TTFCclass1 s2 = new TTFCclass1("����");
//		TTFCclass1 s3 = new TTFCclass1(1111,"����");

		System.out.println("s1.id="+s1.getId());
		System.out.println("s1.name="+s1.getName());

		System.out.println("s2.id="+s2.getId());
		System.out.println("s2.name="+s2.getName());

/**
		System.out.println("s3.id="+s3.getId());
		System.out.println("s3.name="+s3.getName());
*/
	}
}

class TTFCclass1
{
	private int id;
	private String name;

	public TTFCclass1(int id)
	{
		this.id=id;
	}

	public TTFCclass1(String name)
	{
		this(100);
		this.name = name;
	}

/**
	//����: �Ҳ������� TTFCclass1(id);
	public TTFCclass1(int id,String name)
	{
		TTFCclass1(id);
		TTFCclass1(name);
	}
*/

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
}