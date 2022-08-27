/**功能：一维数组模拟栈的数据结构，带测试
 * 日期：2022.8.26
 * 作者：liuyr_1024@163.com
 */
public class myStack{
	public static void main(String[] args){
		Stack s1 = new Stack();		//创建栈对象
		
		//压栈测试
		s1.push(new Object());
		s1.push(new Object());
		s1.push(15);
		s1.push(new Object());
		
		//弹栈测试
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

//栈类
class Stack{
	private Object[] elements;  	//栈体
	private int index;			    //栈帧
	
	//无参构造方法，栈的固定长度为3
	public Stack(){
		this.elements=new Object[3];
		this.index=-1;
	}
	
	//压栈
	public void push(Object obj){
		if(index >= elements.length - 1){		//满栈
			System.out.println("压栈失败，栈已满！");
			return;
		}
		elements[++index]=obj;	//栈帧增加一个单位,元素入栈
		System.out.println("元素" + obj + "压栈成功！栈帧指向->"+index);
	}

	//弹栈
	public Object pop(){	
		if(index < 0){			//空栈
			System.out.println("弹栈失败，栈已空！");
			return null;				//返回空
		}	
		System.out.println("元素" + elements[index] + "弹栈成功！栈帧指向->"+(index-1));
		return elements[index--];	//元素出栈,栈帧减小一个单位	
	}
	
	//set , get方法
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

