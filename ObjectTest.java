/*
���ܣ���������ʹ�ö���
���ڣ�2021.11.11
���ߣ�liuyr_1024@163.com
*/
class ObjectTest 
{
	public static void main(String[] args) 
	{
		Student stu = new Student();               //����Student���Ͷ���ʹ�þֲ�����stu��Ϊ�ö��������

		//����Ĭ��ֵ
		System.out.println("ѧ�ţ�" + stu.no);
		System.out.println("������" + stu.name);
		System.out.println("�Ա�" + stu.sex);
		System.out.println("���䣺" + stu.age);

		stu.name = "LYR";                          //�޸Ķ�������
		System.out.println("������" + stu.name);
	}
}
