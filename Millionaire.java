/*
���ܣ����㸴���ﵽԤ������Ҫ�����
���ڣ�2021.11.21
���ߣ�liuyr_1024@163.com
*/
class Millionaire
{
	
	public static void main(String[] args) 
	{
		int year=1;                             //���
		double principal=12000.0;               //ÿ����׷�ӵı���Ͷ��
		double total=0.0;                       //ÿ�����ĸ�������
		double rate=0.2;                        //������
		double expect=2000000.0;                //Ԥ������
		do
		{
			total=(principal+total)*(1+rate);   //ÿ���õ���Ϣ����׷���ڱ����� 
			System.out.println("��" + year + "��������Ϊ��" + total);   
			year++;             
		}
		while (total<expect);                   
		System.out.println("�ﵽԤ���������Ϊ��" + (year-1));             //�ض�ѭ��һ�Σ�����year�Լӣ�ʵ�������Ҫ��1�õ�
	}
}
