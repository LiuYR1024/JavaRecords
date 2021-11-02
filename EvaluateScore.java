/*
代码功能：使用switch语句对输入的float型成绩数值进行判断，输出评定结果
日期：2021.11.2
作者：liuyr_1024@163.com
*/
class EvaluateScore 
{
	public static void main(String[] args) 
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("输入成绩（0-100）：");
		float score=s.nextFloat();                        //接收float型的成绩数值

		if((score>=0)&&(score<=100))                      //判断成绩数值是否在合理区间
		{
			//swith()里面只能是int（byte、short、char会自动转换类型为int）或string型变量
			//成绩可以为float数值
			//采用成绩与10取商的方法可以有效地将判断float类型数值范围转换为判断int型取值
			int num=(int)(score/10);   
			String result="不合格"; 
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
			System.out.println("成绩评定为"+result);
		}
		else
		{
			System.out.println("输入成绩不合法！");
		}
	}
}
