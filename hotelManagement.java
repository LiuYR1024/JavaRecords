/**
*ģ��Ƶ����ϵͳ����ʵ�ֶ������˷�����ӡ�Ƶ귿����Ϣ
*Data��2022.8.27
*Author��liuyr_1024@163.com
*ÿ������Ҫ��дequals��toString����
*/
public class hotelManagement{
	public static void main(String[] args){
	hotel h1 = new hotel();		//�Ƶ����
	h1.printHotel();
	h1.bookRoom("1-1");
	h1.bookRoom(null);
	h1.bookRoom("3-1");
	h1.bookRoom("2-3");
	h1.checkOut("1-1");
	h1.checkOut(null);
	h1.checkOut("1-1");
	h1.checkOut("3-5");
	h1.printHotel();
	}
}

//������
class room{
	private String roomId;		//����id
	private int roomType;		//��������
	private boolean isFree;		//�Ƿ����

	//���췽��
	public room(){
		this.isFree = true;
	}
	public room(String roomId, int roomType, boolean isFree){
		this.roomId = roomId;
		this.roomType = roomType;
		this.isFree = isFree;
	}

	//set��get����
	public void setRoomId(String roomId){
		this.roomId = roomId;
	}
	public String getRoomId(){
		return roomId;
	}
	public void setRoomType(int roomType){
		this.roomType = roomType;
	}
	public int getRoomType(){
		return roomType;
	}
	public void setIsFree(boolean isFree){
		this.isFree = isFree;
	}
	public boolean getIsFree(){
		return isFree;
	}
}

//�Ƶ���
class hotel{
	private room[][] hotelRoom;		//�Ƶ귿��

	//��ӡ�Ƶ���Ϣ
	public void printHotel(){
		//��ӡ����id
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				System.out.print(hotelRoom[i][j].getRoomId() + " ");
			}
			System.out.println();
		}
		//��ӡ����״̬
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				System.out.print(hotelRoom[i][j].getIsFree() + " ");
			}
			System.out.println();
		}
	}

	//����
	public void bookRoom(String id){
		if (id == null){			//����Ϊ��
			System.out.println("����ʧ�ܣ������뷿��id��");
			return;
		}
		//��������
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				if (id.equals(hotelRoom[i][j].getRoomId())){
					if (true == hotelRoom[i][j].getIsFree()){		//id���ڣ��������
						hotelRoom[i][j].setIsFree(false);
						System.out.println("�����ɹ�������idΪ��" + hotelRoom[i][j].getRoomId());
						return;
					}
					//id���ڣ����䲻����
					System.out.println("����ʧ�ܣ�����" + hotelRoom[i][j].getRoomId() +"����ס����" );
					return;
				}
			}
		}
		//id������
		System.out.println("����ʧ�ܣ�����" + id + "�����ڣ�" );
		return; 
	}

	//�˷�
	public void checkOut(String id){
		if (id == null){			//����Ϊ��
			System.out.println("�˷�ʧ�ܣ������뷿��id��");
			return;
		}
		//��������
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				if (id.equals(hotelRoom[i][j].getRoomId())){
					if (false == hotelRoom[i][j].getIsFree()){		//id���ڣ����䲻����
						hotelRoom[i][j].setIsFree(true);
						System.out.println("�˷��ɹ�������idΪ��" + hotelRoom[i][j].getRoomId());
						return;
					}
					//id���ڣ��������
					System.out.println("�˷�ʧ�ܣ�����" + hotelRoom[i][j].getRoomId() +"��ס����" );
					return;
				}
			}
		}
		//id������
		System.out.println("�˷�ʧ�ܣ�����" + id + "�����ڣ�" );
		return; 
	}
	
	//���췽��
	public hotel(){
		hotelRoom = new room[3][4];		//Ĭ�Ϸ����ģ3*4
		for(int i = 0;i < hotelRoom.length ;i++ ){
			for(int j = 0;j< hotelRoom[i].length ;j++ ){
				hotelRoom[i][j] = new room((i+1) + "-" + (j+1), (i+1),true);
			}
		}	
	}
	
	//set��get
	public void setHotelRoom(room[][] hotelRoom){
		this.hotelRoom = hotelRoom;
	}
	public room[][] getHotelRoom(){
		return hotelRoom;
	}
}