/**
*���ܣ�����ѧ����
*���ڣ�2021.11.11
*���ߣ�liuyr_1024@163.com
*���£���1��2021.11.22: �����װ���������˽�л���ʹ��get set������������
*	   ��2��2021.11.23���ı�ע�͸�ʽ�����빹�캯��
*	   ��3��2021.11.29������this�ؼ��֣����޲ι��캯����Ϊ���Ը�Ĭ��ֵ
*	   ��4��2021.11.30������static�ؼ��ִ�����ѧУ�����ԣ����������飬����������飬�����ܱ������ԡ��꼶��
*/

/**
*����ͬһ��ѧУ��ѧ����
*���ԣ�ѧ�ţ��������Ա�����
*/
class Student 
{
	//�����飬�������ֽ����ļ�ʱִ�У�ִֻ��һ�Σ�һ��������־�ļ�
	//static
	//{
	//	System.out.println("������ִ��");
	//}

	//�������飬��������ʱִ��,ÿ�δ��������ִ��һ��
	//{
	//	System.out.println("��������ִ��");
	//}

	//����
	private int no;         //ѧ��
	private String name;    //����
	private Boolean sex;    //�Ա�
	private int age;        //����
	private Seat seat;      //��λ
	private Teacher teacher;      //��ʦ

	static String school="B��";  //��̬���ԣ����ڸ�ѧ����Ĺ������� ���洢�ڷ������ڴ�

	protected int grade;		  //�꼶���ܱ������ԣ��ɼ̳и�����.����ֱ��ʹ�á�����.���������ķ�ʽ����

	//����
	public void setAge(int fAge)     //�޸�����
	{
		if(fAge<0 || fAge>150)       //���䷶ΧΪ0-150
		{
			System.out.println("���䲻�Ϸ���");
			return;
		}
		age=fAge;
	}
	public int getAge()             //��ȡ����
	{
		return age;
	}

	public int getNo()             //��ȡѧ��
	{
		return no;
	}

	public String getName()        //��ȡ����
	{
		return name;
	}

	public Boolean getSex()        //��ȡ�Ա�
	{
		return sex;
	}

	public void setName(String name)   //�޸�����
	{
		this.name=name;	
	}

	public void setGrade(int grade)   //�޸��꼶
	{
		this.grade=grade;	
	}
	public int getGrade()             //��ȡ�꼶
	{
		System.out.println("ѧ���꼶�ѻ�ȡ");     //��ʶ��䣬��Ӱ�칦�ܣ�Ϊ��˵���������Ƕ�д
		return grade;
	}


	public Student(int fNo,String fName)    //���������캯������ʵ������no��name����ֵ
	{
		no=fNo;
		name=fName;
	}

	public Student(int no,String name,Boolean sex,int age)    //�в������캯������ʵ������no��name����ֵ
	{
		this.no=no;                         //����this�ؼ��ֿ�����Ч����ʵ�������;ֲ�����
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public Student()                        //�޲������캯����ʵ����������Ĭ��ֵ
	{
		//this(10085,"С��");                   //ʹ��this�������ù��캯����������ڵ�һ��
		this(10086,"С��",true,18);         //Ϊ������ѧ������һ���Զ���ĳ�ʼֵ
	}
}
