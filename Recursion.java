/*
����:ʹ�õݹ����1+2+3+...+n
���ڣ�2021.11.10
���ߣ�liuyr_1024@163.com
*/
class Recursion 
{
	public static void main(String[] args) 
	{
		int n=8;
		int result=accumulate(n);
		System.out.println(result);
	}

	//���õݹ����1~n���ۼӺ�
	public static int accumulate(int n)
	{
		if(1==n)//�ݹ����������
		{
			return n;
		}	
		return n+accumulate(n-1);  //�ݹ����accumulate()
	}
}
