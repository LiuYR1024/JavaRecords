/*
���빦��;�ҳ�3-1000֮���������ÿ4����һ��
���ڣ�2021.11.4
����lliuyr_1024@163.com
*/
class IsPrimeNumber 
{
	public static void main(String[] args) 
	{
		
		//����һ����������С�ڸ�������
		System.out.println("����һ��");
		int num1=1;
		for(int i=3 ; i<=1000 ; i++)
		{
			boolean flag=true;        //��־������ture��ʾΪ������false��ʾ��Ϊ����
			for(int j=2 ; j<i ; j++)
			{
				if(0==i%j)            //���ڷ�1�����������
				{
					flag=false;
				}
			}
			if(flag)                  //�������������ʽ
			{
				if(num1<=4)
				{
					num1++;
				}
				else
				{
					num1=2;
					System.out.println();
				}
				System.out.print(i+"\t");
			}
		}
		

		//������������С�ڸ���ƽ������������Ϊ���������б�Ȼ��һ��С��ƽ����
		//�˴���û��ѧϰȡƽ�����ĺ�������Ϊ����������һ��
		System.out.println("\n��������");
		int num2=1;
		for(int i=3 ; i<=1000 ; i++)
		{
			boolean flag=true;
			for(int j=2 ; j<=i/2 ; j++)    //�˴����Ϊ<=,��i=4ʱ
			{
				if(0==i%j)
				{
					flag=false;
				}
			}
			if(flag)
			{
				if(num2<=4)
				{
					num2++;
				}
				else
				{
					num2=2;
					System.out.println();
				}
				System.out.print(i+"\t");
			}
		}
		

		//����������2��3���⣬������Ȼ��6n+1��6n-1������ÿ�μ�6���жϡ��˴�����Ϊ5-1000
		System.out.println("\n��������");
		int num3=1;
		for(int i=6 ; i<=1000 ; i+=6)          //i��6��ʼ��ÿ�μ�6����ʾ6�ı���6n
		{
			boolean flag=true;
			for(int j=2 ; j<=(i-1)/2 ; j++)    //�ж�6n-1�Ƿ�Ϊ����
			{
				if(0==(i-1)%j)
				{
					flag=false;
				}
			}
			if(flag)
			{
				if(num3<=4)
				{
					num3++;
				}
				else
				{
					num3=2;
					System.out.println();
				}
				System.out.print((i-1)+"\t");
			}

			boolean flag1=true;
			for(int j=2 ; j<=(i+1)/2 ; j++)     //�ж�6n+1�Ƿ�Ϊ����
			{
				if(0==(i+1)%j)
				{
					flag1=false;
				}
			}
			if(flag1)
			{
				if(num3<=4)
				{
					num3++;
				}
				else
				{
					num3=2;
					System.out.println();
				}
				System.out.print((i+1)+"\t");
			}
		}
	}
}
