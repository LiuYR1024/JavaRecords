/*
���빦�ܣ�ʹ��switch���������float�ͳɼ���ֵ�����жϣ�����������
���ڣ�2021.11.2
���ߣ�liuyr_1024@163.com
*/
class EvaluateScore 
{
	public static void main(String[] args) 
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("����ɼ���0-100����");
		float score=s.nextFloat();                        //����float�͵ĳɼ���ֵ

		if((score>=0)&&(score<=100))                      //�жϳɼ���ֵ�Ƿ��ں�������
		{
			//swith()����ֻ����int��byte��short��char���Զ�ת������Ϊint����string�ͱ���
			//�ɼ�����Ϊfloat��ֵ
			//���óɼ���10ȡ�̵ķ���������Ч�ؽ��ж�float������ֵ��Χת��Ϊ�ж�int��ȡֵ
			int num=(int)(score/10);   
			String result="���ϸ�"; 
			switch(num)
			{
				case 9 : case 10:
					result="A";
				    break;
				case 8:
					result="B";
				    break;
				case 7:
					result="C";
				    break;
				case 6:
					result="D";
				    break;
			}
			System.out.println("�ɼ�����Ϊ"+result);
		}
		else
		{
			System.out.println("����ɼ����Ϸ���");
		}
	}
}
