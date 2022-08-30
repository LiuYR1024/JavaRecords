/**
*����Arrays�еķ���ʵ��Ԫ�ز���
*Data��2022.8.30
*Author��liuyr_1024@163.com
*/
import java.util.Arrays;

public class ArraysTest{
	public static void main(String[] args){
		int[] arr = {1, 5, 9, 8, 10, 19, 0, 4};
		int dest = 19;

		//Arrays.sort(arr);
		//System.out.println("Ԫ��" + dest + "�ڵ�" + Arrays.binarySearch(arr,dest) + "��λ��");	//Ԫ��19��7��λ��
		/*
		for (int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		*/

		int[][] tempArr = new int[2][arr.length];	//��ά���飬�ֱ���ԭʼԪ�ؼ����±� 
		//System.out.println(tempArr.length);
		//System.out.println(tempArr[1].length);
		
		tempArr[0] = Arrays.copyOfRange(arr, 0, arr.length);
		for (int i=0; i<tempArr[1].length; i++){
			tempArr[1][i] = i;
		}

		for (int i=0; i<tempArr[1].length-1; i++){
			//��ԭʼԪ�ؽ���ѡ������
			int min = i;
			for (int j=i+1; j<tempArr[1].length; j++){
				if (tempArr[1][j] < tempArr[1][min]){
					min = j;
				}
			}
			if (min != i){
				//����Ԫ��λ��
				int temp1 = tempArr[0][i];
				tempArr[0][i] = tempArr[0][min];
				tempArr[0][min] = temp1;
				
				//�����±�λ��
				int temp2 = tempArr[1][i];
				tempArr[1][i] = tempArr[1][min];
				tempArr[1][min] = temp2;
			}
		}
		int index = Arrays.binarySearch(tempArr[0],dest);	//���ַ�����Ԫ��
		System.out.println("Ԫ��" + dest + "���±��ǣ�" + tempArr[1][index]);	//Ԫ��19�ڵ�5��λ��
		
	}
}