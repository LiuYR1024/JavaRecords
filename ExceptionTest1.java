/**
*throw����1
*Data��2022.9.4
*Author��liuyr_1024@163.com
*throw new����ӵĲ�������������
*String���substring()�������ܴ����޸�
*/
public class ExceptionTest1{
	public static void main(String[] args){
		String s1 = "abcdef";
		System.out.println(s1.substring(0,3));//abc���ڶ������������ǽ���λ�õ��±�������
		//System.out.println(s1.substring(-1,3));//���д���StringIndexOutOfBoundsException
	}
}

class C{
	public void test(int a) {
		if (1==a) {
			//throw new Stringnumerror(a);//�������: �Ҳ�������
		}
	}
}