/**
*���ܣ�����java�е�static�ؼ���
*���Խ������1����static�ؼ��ֵ����Ա�ʾ����ĸ�����ֵ��һ����ʹ�á�����.���������ķ�ʽ����
*				Ҳ��ʹ�á�����.���������ķ�ʽ���ʣ���ʵ�������ûᱻϵͳ�滻Ϊ����
*		   ��2��protected���ε����Կ���ֱ�Ӳ��á�����.���������ķ�ʽ���ʣ�Ҳ��ͨ��set��get��������
*				private���ε����Բ��ܲ��С�����.���������ķ�ʽ���ʣ�ֻ��ͨ��set��get��������
*		   ��3�����������������ֽ����ļ�ʱִ�У���ִֻ��һ��
*				���������ڴ�������ʱִ�У�ÿ������һ������ʱ������ִ��һ��
*���ڣ�2021.11.30
*���ߣ�liuyr_1024@163.com
*/
class StaticTest 
{
	public static void main(String[] args) 
	{
		System.out.println("������ִ��");
		Student stu1=new Student();                

		System.out.println(Student.school);         //����.������
		System.out.println(stu1.school);            //����.������

		//System.out.println(stu1.name);            //���󣺲���ͨ��������.������������private����

		stu1.grade=5;                               //ͨ��������.������������protected����
		System.out.println(stu1.grade);
		stu1.setGrade(6);                           //ͨ��set��������protected����
		System.out.println(stu1.getGrade());             //ͨ��get��������protected����

		//System.out.println(Student.grade);       //�����޷��Ӿ�̬�����������÷Ǿ�̬ ���� grade

		
		Student stu2=new Student();
	}
}
