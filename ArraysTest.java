/**
*利用Arrays中的方法实现元素查找
*Data：2022.8.30
*Author：liuyr_1024@163.com
*/
import java.util.Arrays;

public class ArraysTest{
	public static void main(String[] args){
		int[] arr = {1, 5, 9, 8, 10, 19, 0, 4};
		int dest = 19;

		//Arrays.sort(arr);
		//System.out.println("元素" + dest + "在第" + Arrays.binarySearch(arr,dest) + "号位置");	//元素19在7号位置
		/*
		for (int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		*/

		int[][] tempArr = new int[2][arr.length];	//二维数组，分别存放原始元素及其下标 
		//System.out.println(tempArr.length);
		//System.out.println(tempArr[1].length);
		
		tempArr[0] = Arrays.copyOfRange(arr, 0, arr.length);
		for (int i=0; i<tempArr[1].length; i++){
			tempArr[1][i] = i;
		}

		for (int i=0; i<tempArr[1].length-1; i++){
			//按原始元素进行选择排序
			int min = i;
			for (int j=i+1; j<tempArr[1].length; j++){
				if (tempArr[1][j] < tempArr[1][min]){
					min = j;
				}
			}
			if (min != i){
				//交换元素位置
				int temp1 = tempArr[0][i];
				tempArr[0][i] = tempArr[0][min];
				tempArr[0][min] = temp1;
				
				//交换下标位置
				int temp2 = tempArr[1][i];
				tempArr[1][i] = tempArr[1][min];
				tempArr[1][min] = temp2;
			}
		}
		int index = Arrays.binarySearch(tempArr[0],dest);	//二分法查找元素
		System.out.println("元素" + dest + "的下标是：" + tempArr[1][index]);	//元素19在第5号位置
		
	}
}