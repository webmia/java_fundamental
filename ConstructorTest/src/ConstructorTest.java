
class Data1{
	int value;
	
	Data1(){
		System.out.println("Data1�� default ������");
	}
}
class Data2{
	int value;
	
	/*Data2(){
		System.out.println("Data2�� default ������");
	}*/
	Data2(int x){
		value = x;
		System.out.println("Data2�� �Ű������� �޴� ������");
	}
}
public class ConstructorTest {
	
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(10);
		
		System.out.println("d1.value = " + d1.value);
		System.out.println("d2 .value = " + d2.value);
	}
}
