/**
*功能：创建学生类
*日期：2021.11.11
*作者：liuyr_1024@163.com
*更新：（1）2021.11.22: 引入封装概念，将属性私有化，使用get set方法访问属性
*	   （2）2021.11.23：改变注释格式；引入构造函数
*	   （3）2021.11.29：引入this关键字，在无参构造函数中为属性赋默认值
*	   （4）2021.11.30：引入static关键字创建“学校”属性，引入类代码块，引入对象代码块，引入受保护属性“年级”
*/

/**
*属于同一个学校的学生类
*属性：学号，姓名，性别，年龄
*/
class Student 
{
	//类代码块，引入类字节码文件时执行，只执行一次，一般用于日志文件
	//static
	//{
	//	System.out.println("类代码块执行");
	//}

	//对象代码块，创建对象时执行,每次创建对象均执行一次
	//{
	//	System.out.println("对象代码块执行");
	//}

	//属性
	private int no;         //学号
	private String name;    //姓名
	private Boolean sex;    //性别
	private int age;        //年龄
	private Seat seat;      //座位
	private Teacher teacher;      //导师

	static String school="B大";  //静态属性，属于该学生类的公有属性 ，存储在方法区内存

	protected int grade;		  //年级，受保护属性，可继承给子类.可以直接使用“引用.属性名”的方式访问

	//方法
	public void setAge(int fAge)     //修改年龄
	{
		if(fAge<0 || fAge>150)       //年龄范围为0-150
		{
			System.out.println("年龄不合法！");
			return;
		}
		age=fAge;
	}
	public int getAge()             //获取年龄
	{
		return age;
	}

	public int getNo()             //获取学号
	{
		return no;
	}

	public String getName()        //获取姓名
	{
		return name;
	}

	public Boolean getSex()        //获取性别
	{
		return sex;
	}

	public void setName(String name)   //修改名字
	{
		this.name=name;	
	}

	public void setGrade(int grade)   //修改年级
	{
		this.grade=grade;	
	}
	public int getGrade()             //获取年级
	{
		System.out.println("学生年级已获取");     //标识语句，不影响功能，为了说明方法覆盖而写
		return grade;
	}


	public Student(int fNo,String fName)    //含参数构造函数，给实例变量no和name赋初值
	{
		no=fNo;
		name=fName;
	}

	public Student(int no,String name,Boolean sex,int age)    //有参数构造函数，给实例变量no和name赋初值
	{
		this.no=no;                         //引入this关键字可以有效区分实例变量和局部变量
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public Student()                        //无参数构造函数，实例变量均赋默认值
	{
		//this(10085,"小张");                   //使用this方法调用构造函数，必须放在第一行
		this(10086,"小刘",true,18);         //为创建的学生对象赋一个自定义的初始值
	}
}
