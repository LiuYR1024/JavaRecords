/*
���ܣ�����java�����еķ�װ����װ���ڷ����н������ƣ���ֹ���Ա������޸ģ����磬������Ϊ-100���ֲ����������
���ڣ�2021.11.22
���ߣ�liuyr_1024@163.com
*/
class Encapsulation 
{
	public static void main(String[] args) 
	{
		Student stu = new Student();

		/*
		//������ô����age����Ϊage��Student������private���ͣ�˽�����ͣ��ǹ���
		System.out.println("ѧ������Ϊ��" + stu.age);
		*/

		System.out.println("ѧ������Ϊ��" + stu.getAge());     //ʹ��getAge������ȡѧ�����䣬������Ϊ0

		stu.setAge(200);                                       //�ββ�����ȷ��Χ�ڣ���������䲻�Ϸ�����
		System.out.println("ѧ������Ϊ��" + stu.getAge());     //������Ϊ0

		stu.setAge(100);                                       //ʹ��setAge�����޸�ѧ������
		System.out.println("ѧ������Ϊ��" + stu.getAge());     //������Ϊ100
	}
}
