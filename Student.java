/**
*���ܣ�����ѧ����
*���ڣ�2021.11.11
*���ߣ�liuyr_1024@163.com
*���£���1��2021.11.22: �����װ���������˽�л���ʹ��get set������������
*	   ��2��2021.11.23���ı�ע�͸�ʽ�����빹�캯��
*/

/*
���ԣ�ѧ�ţ��������Ա�����
*/
class Student 
{
	//����
	private int no;         //ѧ��
	private String name;    //����
	private Boolean sex;    //�Ա�
	private int age;        //����
	private Seat seat;      //��λ
	private Teacher teacher;      //��ʦ

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

	public Student(int fNo,String fName)    //���������캯������ʵ������no��name����ֵ
	{
		no=fNo;
		name=fName;
	}
	public Student()                        //�޲������캯����ʵ����������Ĭ��ֵ
	{
	}
}
