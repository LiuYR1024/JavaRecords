/*
功能：测试java对象创建时多重使用引用型变量
日期：2021.11.15
作者：liuyr_1024@163.com
*/
class ObjectTest1 
{
	public static void main(String[] args) 
	{
		Student stu = new Student();      //创建Student类，采用引用stu接收其地址

		
		//编译通过，运行时报错：Exception in thread "main" java.lang.NullPointerException
		//此处的stu.seat是一个Seat类对象实例，没有创建这个类的实例对象前，不能直接采用这种方式访问
		//System.out.println(stu.name + "的座位是：" + 
		//	stu.seat.floor + "楼" + stu.seat.classroom + "层" + stu.seat.no + "号" );

		System.out.println(stu.name);    //编译运行均通过
		//stu.name是String类的对象实例，要是没有创建（没有new）之前应该是不能访问的，显然String是例外，开后门了

		stu.name="ZhangSan";             //修改学生姓名

		stu.seat = new Seat();           //创建Seat类

		System.out.println(stu.name + "的座位是：" +
			stu.seat.floor + "楼" + stu.seat.classroom + "层" + stu.seat.no + "号" );  //此时可以正常编译运行

		stu.seat.floor=1;
		stu.seat.classroom=106;
		stu.seat.no=15;
		
		System.out.println(stu.name + "的座位是：" +
			stu.seat.floor + "楼" + stu.seat.classroom + "层" + stu.seat.no + "号" );

		Teacher t1 = new Teacher();      //创建Teacher类
		t1.name="语文教师";

		Teacher t2 = new Teacher();
		t2.name="数学教师";

		stu.teacher=t1;                 //t1是stu的导师

		System.out.println(stu.name + "的导师是：" + t1.name);
		System.out.println(stu.name + "的导师是：" + stu.teacher.name); 

		stu.teacher=t2;                //stu换导师为t2
		System.out.println(stu.name + "的导师是：" + t1.name);
		System.out.println(stu.name + "的导师是：" + stu.teacher.name);

		//后一种访问方式在导师发生变化时可以及时地变化过来
		//A去访问A的成员变量，得写成“A. . .”，这样，才能看出那些变量与A之间的关系
	}
}
