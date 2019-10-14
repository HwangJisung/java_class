package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		// 하나의 클래스를 가지고
		// 같은 범주 안에 있는 여러가지 객체들이 만들어 지는 구조를
		// 클래스의 다형성 이라고 한다.
		
		ComClass c1 = new ComClass();
		System.out.println("hdd :"+ c1.hdd);
		System.out.println("ram :"+ c1.ram);
		System.out.println("cpu :"+ c1.cpu);
		System.out.println("color :"+ c1.color);
		
		System.out.println("=========");
		
		ComClass c2 = new ComClass();
		c2.hdd = 1024;
		System.out.println("hdd :"+ c2.hdd);
		System.out.println("ram :"+ c2.ram);
		System.out.println("cpu :"+ c2.cpu);
		System.out.println("color :"+ c2.color);
		
		System.out.println("=========");
		
		ComClass c3 = new ComClass();
		System.out.println("hdd :"+ c3.hdd);
		System.out.println("ram :"+ c3.ram);
		System.out.println("cpu :"+ c3.cpu);
		System.out.println("color :"+ c3.color);
		
		System.out.println("=========");
		
		ComClass c4 = new ComClass();
		c4.color = "black";
		c4.getInfo();
	}
}
