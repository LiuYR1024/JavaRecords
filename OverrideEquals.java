/**
*重写equals
*Data：2022.9.2
*Author：liuyr_1024@163.com
*返回值为boolean类型时，确定一种最终返回类型，将另一种类型的情况中途返回
*若已确定传入值是同一类型，可写成三目运算形式更简洁
*/
public class OverrideEquals{
	public static void main(String[] args){
		C c1 = new C(1);
		C c2 = new C(1);
		C c3 = new C(2);
		//System.out.println(c1.equals(c2));	//重写前输出结果：false
		System.out.println(c1.equals(c2));		//重写后输出结果：true
		System.out.println(c1.equals(c3));		//重写后输出结果：false

		System.out.println("*********");	
		
		System.out.println(c1.equals1(c2));		//输出结果：true
		System.out.println(c1.equals1(c3));		//输出结果：false
		System.out.println(c1.equals1(null));	//输出结果：false
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

	//重写equals，id相等则对象相等
	public boolean equals(Object anObject) {
		if (this == anObject) {
			return true;
		}
		if (anObject instanceof C){
			C tc = (C) anObject;		//强制类型转换
			if (tc.id == id) {
				return true;
			}
		}
		return false;
	}
	
	//若输入为同类对象，可简写为三目运算形式
	public boolean equals1(C c) {
		return (this == c) ? true : (c != null) && (id == c.id);
	}
}