/*
���빦�ܣ�������������dayNum������1+2+4+...+2^(dayNum-1)�ļ�����
���ڣ�2021.11.3
���ߣ�liuyr_1024@163.com
*/
class TestFor 
{
	public static void main(String[] args) 
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("����������1-20����");
		int dayNum=s.nextInt();

		if((dayNum>0)&&(dayNum<=20))
		{
			int result=0;              //��ż�����
			int temp=1;				   //��ʱ��������ŵ�i�����ݵ�ֵ
			for(int i=1;i<=dayNum;i++) 
			{
				result+=temp;          //�ۼ�
				temp*=2;               //temp��ֵΪ1���Ѿ��ܹ�������һ�����ݣ����԰Ѹı�temp�����ۼӼ���ĺ���
			}
			System.out.println("����Ϊ��"+result);
		}
		else
		{
			System.out.println("�������ݲ��Ϸ���");		
		}
	}	
}
