/*
Function: Test About Exception 
Data��2022.10.24
Author��liuyr_1024@163.com
*/

import java.util.Scanner;

public class TestRegister{
	public static void main(String args[]){
		String username = null;
		String password = null;

		System.out.print("�����û�����");
		Scanner sc1 = new Scanner (System.in);
		username = sc1.next();

		System.out.print("�������룺");
		Scanner sc2 = new Scanner (System.in);
		password = sc2.next();


		UserService us = new UserService ();
		try {
			us.register(username,password);
		}catch (RegisterException e){
			e.printStackTrace();
		}

	}
}

//test class
class UserService{
	//test method
	public void register(String username,String password) throws RegisterException{
		if (username == null || password == null){
			throw new RegisterException("�û��������벻��Ϊ�գ�");//generate and throw an exception
		}
		int len = username.length();
		if (len < 6 || len > 14){
			throw new RegisterException("�û���������[6-14]֮�䣡");
		}
		System.out.println("ע��ɹ���");
	}
}

//custom exception class
class RegisterException extends Exception{
	public RegisterException(){}

	public RegisterException(String s){
		super(s);
	}
}