class Car{
	int serialNo;
	String color;
	String gearType;
	int door;
	static int count = 0;
	
	//인스턴스 초기자
	{
		serialNo = ++count;
	}//생성자 호출 직전에 인스턴스를 먼저 초기화 하고 생성자를 호출함
	
	//디폴트생성자
	Car(){
		//this("black","auto",4);
		//serialNo = ++count;
		this.color = "black";
		this.gearType = "auto";
		this.door = 4;
	}
	
	//매개변수를 받는 생성자
	Car (String color){
		//serialNo = ++count;
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
	}
	
	//매개변수를 받는 생성자
	Car(String color, String gearType, int door){
		//serialNo = ++count;
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//복사생성자
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
		
		System.out.println("c1의 serialNo=" + c1.serialNo + "c1.color = " 
				+ c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 serialNo=" + c2.serialNo + "c2.color = " 
				+ c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		System.out.println("c3의 serialNo=" + c3.serialNo + "c3.color = "
				+ c3.color + ", gearType = " + c3.gearType + ", door = " + c3.door);
		System.out.println("c4의 serialNo=" + c4.serialNo + "c4.color = " 
				+ c4.color + ", gearType = " + c4.gearType + ", door = " + c4.door);
	}

}
