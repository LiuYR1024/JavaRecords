/*
���ã�����i+=10��i=i+10������
�����i+=10;������iΪbyte�ͣ��ȼ���i=(byte)(i+10);
���ڣ�2021.10.28
���ߣ�liuyr_1024@163.com
*/
class AssignmentOperator 
{
	public static void main(String[] args) 
	{
		byte i=10;
		System.out.println(i);
		//i=i+10;                //����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		//iΪbyte�ͣ�10��Ĭ�ϵ�int�ͣ�������ӵĽ����int�ͣ����ܸ�����ߵ�byte��

		i+=10;          //�ȼ���i=(byte)(i+10);������ǿ������ת��
	    System.out.println(i);
	}
}
