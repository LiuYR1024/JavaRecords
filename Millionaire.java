/*
功能：计算复利达到预期所需要的年份
日期：2021.11.21
作者：liuyr_1024@163.com
*/
class Millionaire
{
	
	public static void main(String[] args) 
	{
		int year=1;                             //年份
		double principal=12000.0;               //每年能追加的本金投入
		double total=0.0;                       //每年最后的复利总数
		double rate=0.2;                        //年利率
		double expect=2000000.0;                //预期数额
		do
		{
			total=(principal+total)*(1+rate);   //每年获得的利息又来追加在本金上 
			System.out.println("第" + year + "年总收入为：" + total);   
			year++;             
		}
		while (total<expect);                   
		System.out.println("达到预期所需年份为：" + (year-1));             //必定循环一次，导致year自加，实际年份需要减1得到
	}
}
