class Car{
	int serialNo;
	String color;
	String gearType;
	int door;
	static int count = 0;
	
	//�ν��Ͻ� �ʱ���
	{
		serialNo = ++count;
	}//������ ȣ�� ������ �ν��Ͻ��� ���� �ʱ�ȭ �ϰ� �����ڸ� ȣ����
	
	//����Ʈ������
	Car(){
		//this("black","auto",4);
		//serialNo = ++count;
		this.color = "black";
		this.gearType = "auto";
		this.door = 4;
	}
	
	//�Ű������� �޴� ������
	Car (String color){
		//serialNo = ++count;
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
	}
	
	//�Ű������� �޴� ������
	Car(String color, String gearType, int door){
		//serialNo = ++count;
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//���������
	Car (Car c){
		//serialNo = ++count;
		//this(c.color,c.gearType,c.door);
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	
}
public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		/*c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;*/
		
		Car c2 = new Car("red", "manual", 2);
		Car c3 = new Car("blue");
		
		Car c4 = new Car(c3);
		
		System.out.println("c1�� serialNo=" + c1.serialNo + "c1.color = " 
				+ c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2�� serialNo=" + c2.serialNo + "c2.color = " 
				+ c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		System.out.println("c3�� serialNo=" + c3.serialNo + "c3.color = "
				+ c3.color + ", gearType = " + c3.gearType + ", door = " + c3.door);
		System.out.println("c4�� serialNo=" + c4.serialNo + "c4.color = " 
				+ c4.color + ", gearType = " + c4.gearType + ", door = " + c4.door);
	}

}
