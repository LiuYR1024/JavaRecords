/*
���ܣ�����java���󴴽�ʱ����ʹ�������ͱ���
���ڣ�2021.11.15
���ߣ�liuyr_1024@163.com
*/
class ObjectTest1 
{
	public static void main(String[] args) 
	{
		Student stu = new Student();      //����Student�࣬��������stu�������ַ

		
		//����ͨ��������ʱ����Exception in thread "main" java.lang.NullPointerException
		//�˴���stu.seat��һ��Seat�����ʵ����û�д���������ʵ������ǰ������ֱ�Ӳ������ַ�ʽ����
		//System.out.println(stu.name + "����λ�ǣ�" + 
		//	stu.seat.floor + "¥" + stu.seat.classroom + "��" + stu.seat.no + "��" );

		System.out.println(stu.name);    //�������о�ͨ��
		//stu.name��String��Ķ���ʵ����Ҫ��û�д�����û��new��֮ǰӦ���ǲ��ܷ��ʵģ���ȻString�����⣬��������

		stu.name="ZhangSan";             //�޸�ѧ������

		stu.seat = new Seat();           //����Seat��

		System.out.println(stu.name + "����λ�ǣ�" +
			stu.seat.floor + "¥" + stu.seat.classroom + "��" + stu.seat.no + "��" );  //��ʱ����������������

		stu.seat.floor=1;
		stu.seat.classroom=106;
		stu.seat.no=15;
		
		System.out.println(stu.name + "����λ�ǣ�" +
			stu.seat.floor + "¥" + stu.seat.classroom + "��" + stu.seat.no + "��" );

		Teacher t1 = new Teacher();      //����Teacher��
		t1.name="���Ľ�ʦ";

		Teacher t2 = new Teacher();
		t2.name="��ѧ��ʦ";

		stu.teacher=t1;                 //t1��stu�ĵ�ʦ

		System.out.println(stu.name + "�ĵ�ʦ�ǣ�" + t1.name);
		System.out.println(stu.name + "�ĵ�ʦ�ǣ�" + stu.teacher.name); 

		stu.teacher=t2;                //stu����ʦΪt2
		System.out.println(stu.name + "�ĵ�ʦ�ǣ�" + t1.name);
		System.out.println(stu.name + "�ĵ�ʦ�ǣ�" + stu.teacher.name);

		//��һ�ַ��ʷ�ʽ�ڵ�ʦ�����仯ʱ���Լ�ʱ�ر仯����
		//Aȥ����A�ĳ�Ա��������д�ɡ�A. . .�������������ܿ�����Щ������A֮��Ĺ�ϵ
	}
}
