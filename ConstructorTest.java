/**
*���빦�ܣ�����java�еĹ��캯��
*���Խ������1���������Ժ�ϵͳ���Զ�����һ�����ɼ����޲������캯��
*		   ��2���Լ�д�˹��캯����ϵͳ�Զ������Ĺ��캯����ʧ
*               Ϊ�˷�ֹ���в����ֵ�Ķ��󴴽�����Ҫд����һ�����캯�����ɴ˿ɼ����캯��֧������
*���ڣ�2021.11.23
*���ߣ�liuyr_1024@163.com
*/
class ConstructorTest 
{
	public static void main(String[] args) 
	{
		Student stu1 = new Student();                         //�����޲������캯��
		System.out.println("ѧ��Ϊ��" + stu1.getNo());
		System.out.println("����Ϊ��" + stu1.getName());

		Student stu2 = new Student(10086,"С��");             //���ú��������캯��
		System.out.println("ѧ��Ϊ��" + stu2.getNo());
		System.out.println("����Ϊ��" + stu2.getName());
		System.out.println("����Ϊ��" + stu2.getAge());       //����û��ͨ��ʵ�γ�ʼ����ʵ����������Ĭ��ֵ
	}
}
