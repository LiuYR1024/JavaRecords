/*
代码功能：输入身高、体重，计算返回BMI和评估结果
日期：2021.11.1
作者：liuyr_1024@163.com
*/
class CalculateBodyMassIndex 
{
	public static void main(String[] args) 
	{
		java.util.Scanner s=new java.util.Scanner (System.in);

		System.out.print("请输入身高:（单位cm，范围0-300）");
		float height=s.nextFloat();         //获取float型身高数值
		//System.out.println("身高为："+height+"cm");
		if((height<0)||(height>300))        //判断身高是否在合理范围
		{
			System.out.println("身高数值不合法!");
			return;
		}

		System.out.print("请输入体重:（单位Kg，范围0-500）");
		float weight=s.nextFloat();          //获取float型体重数值
		//System.out.println("体重为："+weight+"Kg");
		if(((weight<0)||(weight>500)))       //判断体重是否在合理范围
		{
			System.out.println("体重数值不合法!");
			return;
		}

		//计算BMI：BMI=体重（Kg）/身高（m）的平方
		float bodyMassIndex=weight*100*100/(height*height);
		System.out.print("BMI："+ bodyMassIndex + "\t");
		
		//根据BMI数值给出评估结果
		String result="重度肥胖";
		if(bodyMassIndex<18.5)
		{
			result="体重过轻";
		}
		else if(bodyMassIndex<24)
		{
			result="正常范围";
		}
		else if(bodyMassIndex<27)
		{
			result="体重过重";
		}
		else if(bodyMassIndex<30)
		{
			result="轻度肥胖";
		}
		else if(bodyMassIndex<35)
		{
			result="中度肥胖";
		}
		System.out.println("评估结果："+result);
	}
}
