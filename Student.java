/*
���ܣ�����ѧ����
���ڣ�2021.11.11
���ߣ�liuyr_1024@163.com
���£���1��2021.11.22: �����װ���������˽�л���ʹ��get set������������
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
}
