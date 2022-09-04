/**
*throw测试1
*Data：2022.9.4
*Author：liuyr_1024@163.com
*throw new后面接的并不能任意命名
*String类的substring()方法可能存在修改
*/
public class ExceptionTest1{
	public static void main(String[] args){
		String s1 = "abcdef";
		System.out.println(s1.substring(0,3));//abc，第二个参数不再是结束位置的下标索引？
		//System.out.println(s1.substring(-1,3));//运行错误：StringIndexOutOfBoundsException
	}
}

class C{
	public void test(int a) {
		if (1==a) {
			//throw new Stringnumerror(a);//编译错误: 找不到符号
		}
	}
}