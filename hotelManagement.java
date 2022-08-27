/**
*模拟酒店管理系统，可实现订房，退房，打印酒店房间信息
*Data：2022.8.27
*Author：liuyr_1024@163.com
*每个类需要重写equals和toString方法
*/
public class hotelManagement{
	public static void main(String[] args){
	hotel h1 = new hotel();		//酒店对象
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

//房间类
class room{
	private String roomId;		//房间id
	private int roomType;		//房间类型
	private boolean isFree;		//是否空闲

	//构造方法
	public room(){
		this.isFree = true;
	}
	public room(String roomId, int roomType, boolean isFree){
		this.roomId = roomId;
		this.roomType = roomType;
		this.isFree = isFree;
	}

	//set，get方法
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

//酒店类
class hotel{
	private room[][] hotelRoom;		//酒店房间

	//打印酒店信息
	public void printHotel(){
		//打印房间id
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				System.out.print(hotelRoom[i][j].getRoomId() + " ");
			}
			System.out.println();
		}
		//打印房间状态
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				System.out.print(hotelRoom[i][j].getIsFree() + " ");
			}
			System.out.println();
		}
	}

	//订房
	public void bookRoom(String id){
		if (id == null){			//参数为空
			System.out.println("订房失败，请输入房间id！");
			return;
		}
		//遍历房间
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				if (id.equals(hotelRoom[i][j].getRoomId())){
					if (true == hotelRoom[i][j].getIsFree()){		//id存在，房间空闲
						hotelRoom[i][j].setIsFree(false);
						System.out.println("订房成功，房间id为：" + hotelRoom[i][j].getRoomId());
						return;
					}
					//id存在，房间不空闲
					System.out.println("订房失败，房间" + hotelRoom[i][j].getRoomId() +"已有住户！" );
					return;
				}
			}
		}
		//id不存在
		System.out.println("订房失败，房间" + id + "不存在！" );
		return; 
	}

	//退房
	public void checkOut(String id){
		if (id == null){			//参数为空
			System.out.println("退房失败，请输入房间id！");
			return;
		}
		//遍历房间
		for (int i = 0;i < hotelRoom.length;i++ ){
			for (int j = 0;j<hotelRoom[i].length;j++ ){
				if (id.equals(hotelRoom[i][j].getRoomId())){
					if (false == hotelRoom[i][j].getIsFree()){		//id存在，房间不空闲
						hotelRoom[i][j].setIsFree(true);
						System.out.println("退房成功，房间id为：" + hotelRoom[i][j].getRoomId());
						return;
					}
					//id存在，房间空闲
					System.out.println("退房失败，房间" + hotelRoom[i][j].getRoomId() +"无住户！" );
					return;
				}
			}
		}
		//id不存在
		System.out.println("退房失败，房间" + id + "不存在！" );
		return; 
	}
	
	//构造方法
	public hotel(){
		hotelRoom = new room[3][4];		//默认房间规模3*4
		for(int i = 0;i < hotelRoom.length ;i++ ){
			for(int j = 0;j< hotelRoom[i].length ;j++ ){
				hotelRoom[i][j] = new room((i+1) + "-" + (j+1), (i+1),true);
			}
		}	
	}
	
	//set，get
	public void setHotelRoom(room[][] hotelRoom){
		this.hotelRoom = hotelRoom;
	}
	public room[][] getHotelRoom(){
		return hotelRoom;
	}
}