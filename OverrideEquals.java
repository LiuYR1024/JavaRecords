/**
*��дequals
*Data��2022.9.2
*Author��liuyr_1024@163.com
*����ֵΪboolean����ʱ��ȷ��һ�����շ������ͣ�����һ�����͵������;����
*����ȷ������ֵ��ͬһ���ͣ���д����Ŀ������ʽ�����
*/
public class OverrideEquals{
	public static void main(String[] args){
		C c1 = new C(1);
		C c2 = new C(1);
		C c3 = new C(2);
		//System.out.println(c1.equals(c2));	//��дǰ��������false
		System.out.println(c1.equals(c2));		//��д����������true
		System.out.println(c1.equals(c3));		//��д����������false

		System.out.println("*********");	
		
		System.out.println(c1.equals1(c2));		//��������true
		System.out.println(c1.equals1(c3));		//��������false
		System.out.println(c1.equals1(null));	//��������false
	}
}

class C{
	private int id;

	public C(int id){
		this.id = id;
	}
	public C(){}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	//��дequals��id�����������
	public boolean equals(Object anObject) {
		if (this == anObject) {
			return true;
		}
		if (anObject instanceof C){
			C tc = (C) anObject;		//ǿ������ת��
			if (tc.id == id) {
				return true;
			}
		}
		return false;
	}
	
	//������Ϊͬ����󣬿ɼ�дΪ��Ŀ������ʽ
	public boolean equals1(C c) {
		return (this == c) ? true : (c != null) && (id == c.id);
	}
}