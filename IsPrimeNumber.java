/*
代码功能;找出3-1000之间的素数，每4个换一行
日期：2021.11.4
作者lliuyr_1024@163.com
*/
class IsPrimeNumber 
{
	public static void main(String[] args) 
	{
		
		//方法一：遍历所有小于该数的数
		System.out.println("方法一：");
		int num1=1;
		for(int i=3 ; i<=1000 ; i++)
		{
			boolean flag=true;        //标志变量，ture表示为素数，false表示不为素数
			for(int j=2 ; j<i ; j++)
			{
				if(0==i%j)            //存在非1和自身的因数
				{
					flag=false;
				}
			}
			if(flag)                  //是素数，输出格式
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
		

		//方法二：遍历小于该数平方根的数，因为两个因数中必然有一个小于平方根
		//此处，没有学习取平方根的函数，改为遍历该数的一半
		System.out.println("\n方法二：");
		int num2=1;
		for(int i=3 ; i<=1000 ; i++)
		{
			boolean flag=true;
			for(int j=2 ; j<=i/2 ; j++)    //此处需变为<=,如i=4时
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
		

		//方法三：除2、3以外，素数必然是6n+1或6n-1，所以每次加6做判断。此处改题为5-1000
		System.out.println("\n方法三：");
		int num3=1;
		for(int i=6 ; i<=1000 ; i+=6)          //i从6开始，每次加6，表示6的倍数6n
		{
			boolean flag=true;
			for(int j=2 ; j<=(i-1)/2 ; j++)    //判断6n-1是否为素数
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
			for(int j=2 ; j<=(i+1)/2 ; j++)     //判断6n+1是否为素数
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
