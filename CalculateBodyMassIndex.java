/*
���빦�ܣ�������ߡ����أ����㷵��BMI���������
���ڣ�2021.11.1
���ߣ�liuyr_1024@163.com
*/
class CalculateBodyMassIndex 
{
	public static void main(String[] args) 
	{
		java.util.Scanner s=new java.util.Scanner (System.in);

		System.out.print("���������:����λcm����Χ0-300��");
		float height=s.nextFloat();         //��ȡfloat�������ֵ
		//System.out.println("���Ϊ��"+height+"cm");
		if((height<0)||(height>300))        //�ж�����Ƿ��ں���Χ
		{
			System.out.println("�����ֵ���Ϸ�!");
			return;
		}

		System.out.print("����������:����λKg����Χ0-500��");
		float weight=s.nextFloat();          //��ȡfloat��������ֵ
		//System.out.println("����Ϊ��"+weight+"Kg");
		if(((weight<0)||(weight>500)))       //�ж������Ƿ��ں���Χ
		{
			System.out.println("������ֵ���Ϸ�!");
			return;
		}

		//����BMI��BMI=���أ�Kg��/��ߣ�m����ƽ��
		float bodyMassIndex=weight*100*100/(height*height);
		System.out.print("BMI��"+ bodyMassIndex + "\t");
		
		//����BMI��ֵ�����������
		String result="�ضȷ���";
		if(bodyMassIndex<18.5)
		{
			result="���ع���";
		}
		else if(bodyMassIndex<24)
		{
			result="������Χ";
		}
		else if(bodyMassIndex<27)
		{
			result="���ع���";
		}
		else if(bodyMassIndex<30)
		{
			result="��ȷ���";
		}
		else if(bodyMassIndex<35)
		{
			result="�жȷ���";
		}
		System.out.println("���������"+result);
	}
}
