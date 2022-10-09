/*
Function: Generate five different random numbers
Data：2022.10.09
Author：liuyr_1024@163.com
*/

//import
import java.util.Arrays;
import java.util.Random;


public class RandomTest{
	public static void main(String[] args){
		Random rand = new Random();		//Creat a random number generator
		int[] arr = new int[5];			//Int array with initial value = 0
		for(int i = 0; i<arr.length; i++){	//Change arr value to -1
			arr[i] = -1;
		}
		int index = 0;
		while (index < arr.length){
			int num = 100 + rand.nextInt(5);	//Generate a randon number
			System.out.println("生成的随机数为：" + num);
			if (!isElement(arr,num)){	//num is not a element of arr
				arr[index++] = num;		//Save the num 
			}
		}
		for(int i = 0; i<arr.length; i++){	//Traversal array
			System.out.println(arr[i]);
		}
	}

	//Determine whether num is in arr,return true or false
	public static boolean isElement(int[] arr, int num){
		int[] temparr = Arrays.copyOf(arr,arr.length);	//Avoid changing arr values
		Arrays.sort(temparr);	//temparr sorting
		return Arrays.binarySearch(temparr,num)>=0;		//binary search
	}
}