/**
*���ܣ�����java�е�this������java�и�������µķ�������
*���Խ������1��thisָ����ǰ�Ķ��󣬿���ȱʡ��ϵͳ���Զ����룬�����ֳ�ͻʱ����д��
*		   ��2�����ô���static�ķ������С�����.���������ķ�ʽ�������е�ǰ����Ҳ��û��this
*		   ��3���������޲ι��캯����ʹ�á�this��ʵ�Σ�������д�õĺ��ι��캯�������ٴ����ظ���Ϊ���Ը��Զ����ֵ
*		   ��4��this���Դ�͸�����ڷ�static�ķ����е��÷�static����Ҳ�ǿ��еġ�
*               ��Ϊǰһ�����������ڴ��������ǰ��С���ã��ʺ�һ����������ʱ��this��Ч
*		   ��5������static�ķ���Ҳ���Բ��С�������.���������ķ�ʽ���ã�ϵͳ���Զ�ת��Ϊ������.��������
*		   ��6��static��������static������������.����������ͬһ�����п���ֱ�ӡ���������������������.��������
*               static�����е��÷�static��������������.��������
*				��static��������static������������.����������ͬһ�����п���ֱ�ӡ���������������������.��������
*               ��static�����е��÷�static��������this.��������������ʡ��this��д
*���ڣ�2021.11.29
*���ߣ�liuyr_1024@163.com
*/

class ThisTest 
{
	public static void method1()
	{
		System.out.println("method1");
	}


	public void method3()
	{
		System.out.println("method3");

		ThisTest.method1();                   //������.�����������������÷�ʽ���ڷ�static�����У�����static����
		method1();                            //�ڷ�static�����У�����ͬһ�����е���static��������ʡ��������д
		ThisTest tt1=new ThisTest();          //����һ��ThisTest����
		tt1.method1();                        //�ڷ�static�����У����á�������.���������ķ�ʽ������static����
		tt1=null;                             //������tt1�ÿգ��������ٵ��ڴ�ռ��Ѿ��ͷ�
		tt1.method1();                        //�˴���Ȼ����ʹ�����ַ�������method��˵����������.���������ĵ��÷�ʽ
		                                      //ʵ������ͨ��������ȷ������������ʵ���û��ǡ�����.��������

		this.method4();                       //��static�����У����á�this.���������ķ�ʽ���÷�static����
		method4();							  //this����ʡ�Բ�д
	}

	public  void method4()
	{
		System.out.println("method4");
	}



	public static void main(String[] args) 
	{
		Student stu1=new Student();           //�����޲ι��캯��������һ��ѧ������

		System.out.println(stu1.getNo());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		System.out.println(stu1.getSex());

		System.out.println("*******************");

		ThisTest.method1();                   //������.�����������������÷�ʽ����static�����У�����static����
		method1();                            //��static�����У�����ͬһ�����е���static��������ʡ��������д
		ThisTest tt1=new ThisTest();          //����һ��ThisTest����
		tt1.method1();                        //��static�����У����á�������.���������ķ�ʽ������static����
		tt1=null;                             //������tt1�ÿգ��������ٵ��ڴ�ռ��Ѿ��ͷ�
		tt1.method1();                        //�˴���Ȼ����ʹ�����ַ�������method��˵����������.���������ĵ��÷�ʽ
		                                      //ʵ������ͨ��������ȷ������������ʵ���û��ǡ�����.��������
		
		System.out.println("*******************");

		//ThisTest.method3();                 //������static�����У���static���������á�����.���������ķ�ʽ����
		//method3();                          //������static�����У���static���������á����������ķ�ʽ����
		//this.method3();                     //������static�����У���static���������á�this.���������ķ�ʽ����       
		ThisTest tt2=new ThisTest();
		tt2.method3();                        //static�����е��÷�static���������á�������.���������ķ�ʽ


	}
}
