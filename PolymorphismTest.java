/**
*���ܣ�����java�еĶ�̬
*���Խ������1����̬���Լ��ٴ�����ϣ���ߴ�����ֲ��
*		   ��2����̬��ָͬһ���󣬴������׶εĶ������ͺ����н׶εĶ������Ͳ�һ��
*���ڣ�2021.12.1
*���ߣ�liuyr_1024@163.com
*/
class PolymorphismTest
{
	public static void main(String[] args) 
	{
		Master m1=new Master();
		//��������������󣬸����˸��ࡣ���Ǵ���������󣬸������࣬����Ҫʹ��instanceof���жϣ����ٳ���
		//����׶α����ɸ��࣬��������ȷʵ����eat�������ʲ��ᱨ������Ҫʹ�õ�������еķ������򲻿���
		//���н׶α��������������ʾ��������
		//�������Ҫ������Ϊ����Ķ��󣬶��Ǿ���Ķ���
		Pet p=new Cat();            
		m1.feed(p);
		p=new Dog();
		m1.feed(p);	
	}
}

class Master
{
	public void feed(Pet p)
	{
		p.eat();
	}
}

class Pet
{
	public void eat()
	{
		System.out.println("�����ڳԶ���");
	}
}

class Cat extends Pet
{
	public void eat()
	{
		System.out.println("Сè�ڳԶ���");
	}
}

class Dog extends Pet
{
	public void eat()
	{
		System.out.println("С���ڳԶ���");
	}
}