//����char����Ĭ��ֵ����ʾ���
//���Խ����java�汾��1.8.0_101��,char��Ĭ��ֵ��ʾΪ��
//���ڣ�2021.10.25
//���ߣ�liuyr_10242@163.com
//���䣺��ʾ����Ϳ���̨���������й�
public class DefaultForChar 
{
	static char globalC;          //��Ա��������ֵ������ϵͳ���Զ���Ĭ��ֵ
	public static void main(String[] args) 
	{
		char localC='\u0000';    //\u0000��char���͵�Ĭ��ֵ
		System.out.println(localC);
		System.out.println("===========");
		System.out.println(globalC);
	}
}
