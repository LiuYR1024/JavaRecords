/**
*���ܣ�����java�еļ̳�
*���Խ������1������ֱ�Ӽ̳и����еķ�private���Ժͷ���
*				�ɼ�ӷ���private����
*		   ��2��������д��������������ֵ���ͣ��β��б���Ҫ����һ�²��ܹ��ɷ�������
*���ڣ�2021.11.30
*���ߣ�liuyr_1024@163.com
*/
class ExtendsTest 
{
	public static void main(String[] args) 
	{
		Student stu1=new Student();                         //����ѧ������
		System.out.println("���֣�" + stu1.getName());
		System.out.println("�꼶��" + stu1.getGrade());

		Pupil pup1=new Pupil();                             //����Сѧ������
		System.out.println("���֣�" + pup1.getName());
		System.out.println("�꼶��" + pup1.getGrade());     //�˴����õ�����д���getGrade����

		//System.out.println("�꼶��" + pup1.name);         //���󣺲�����ô����private����
		System.out.println("�꼶��" + pup1.grade);          //ֱ�ӷ��ʴӸ���̳еõ���protected����

	}
}
