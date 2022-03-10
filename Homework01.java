/*
代码功能：作业1，模拟汽车加减速
日期：2022.3.10
作者：liuyr_1024@163.com
*/
clas
public class Homework01
{
	public static void main(String[] args)
	{
		Vehicle V1=new Vehicle(100,10);
		V1.move();
		V1.speedUp(10);
		V1.move();
		V1.speedDown(50);
		V1.move();
	}

}

class Vehicle
{
	private int speed;
	private int size;

	public Vehicle(){}

	public Vehicle(int speed,int size)
	{
		this.speed=speed;
		this.size=size;
	}

	public void move()
	{
		System.out.println("汽车移动速度为："+speed);
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void speedUp(int upNum)
	{
		speed=speed+upNum;
		System.out.println("汽车加速了："+upNum);
	}
	public void speedDown(int downNum)
	{
		speed=speed-downNum;
		System.out.println("汽车减速了："+downNum);
	}
}