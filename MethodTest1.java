/*
���ܣ����Է����е�return���
���ڣ�2021.11.8
���ߣ�liuyr_1024@163.com
*/
class MethodTest1 
{
	public static void main(String[] args) 
	{
		//����ͬһ�����µķ������Բ���ǰ�������
		System.out.println(doSomething());   //����������ڲ�����dosomething����
	}
	public static int doSomething()
	{
		int i=3;

		/*
		//����: ȱ�ٷ������
		//��Ȼ�߼����Ѿ����������еĿ����ԣ�������׶�ֻ�����������Ƿ����Ҫ�󣬲���ȥ������ֵ���ж�
		if(i<10)
		{
			return 1;
		}
		else if(i>=10)
		{
			return 0;
		}
		*/

		if(i<10)
		{
			return 1;
		}
		else           //ʹ����else����һ����һ��������֧��ִ��
		{
			return 0;
		}
	}

}
