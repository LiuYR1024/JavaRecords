/*
���빦�ܣ�������ʾ���루0,9999��֮�ڵ���ݣ�ϵͳ�����Ƿ���������жϽ��
���ڣ�2021.11.1
���ߣ�liuyr_1024@163.com
*/
class IsLeapYear 
{
	public static void main(String[] args) 
	{
		System.out.print("��������ݣ�");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int year=s.nextInt();
		if((year>0)&&(year<9999))              //������������䣨0,9999��֮��
		{
			//������жϱ�׼����������һ��������Ϊ���꣩��
			//1.�ܱ�4���������ǲ��ܱ�100����
			//2.�ܱ�400����
			if(((0==year%4)&&(0!=year%100))||(0==year%400))
			{
				System.out.println(year+"��������");
			}
			else
			{
				System.out.println(year+"�겻������");
			}
		}
		else                                   //������ݲ������䣨0,9999��֮��
		{
			System.out.println("�������ݲ��Ϸ�");
		}
	}
}
