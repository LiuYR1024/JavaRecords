/**���ܣ�һά����ģ��ջ�����ݽṹ��������
 * ���ڣ�2022.8.26
 * ���ߣ�liuyr_1024@163.com
 */
public class myStack{
	public static void main(String[] args){
		Stack s1 = new Stack();		//����ջ����
		
		//ѹջ����
		s1.push(new Object());
		s1.push(new Object());
		s1.push(15);
		s1.push(new Object());
		
		//��ջ����
		Object o1 = new Object();
		o1 = s1.pop();
		Object o2 = new Object();
		o2 = s1.pop();
		Object o3 = new Object();
		o3 = s1.pop();
		Object o4 = new Object();
		o4 = s1.pop();
	}
}

//ջ��
class Stack{
	private Object[] elements;  	//ջ��
	private int index;			    //ջ֡
	
	//�޲ι��췽����ջ�Ĺ̶�����Ϊ3
	public Stack(){
		this.elements=new Object[3];
		this.index=-1;
	}
	
	//ѹջ
	public void push(Object obj){
		if(index >= elements.length - 1){		//��ջ
			System.out.println("ѹջʧ�ܣ�ջ������");
			return;
		}
		elements[++index]=obj;	//ջ֡����һ����λ,Ԫ����ջ
		System.out.println("Ԫ��" + obj + "ѹջ�ɹ���ջָ֡��->"+index);
	}

	//��ջ
	public Object pop(){	
		if(index < 0){			//��ջ
			System.out.println("��ջʧ�ܣ�ջ�ѿգ�");
			return null;				//���ؿ�
		}	
		System.out.println("Ԫ��" + elements[index] + "��ջ�ɹ���ջָ֡��->"+(index-1));
		return elements[index--];	//Ԫ�س�ջ,ջ֡��Сһ����λ	
	}
	
	//set , get����
	public void setEelements(Object[] elements) {
		this.elements =elements;
	}
	
	public Object[] getElements() {
		return elements;
	}
	
	public void setIndex(int index) {
		this.index =index;
	}
	
	public int getIndex() {
		return index;
	}
}

